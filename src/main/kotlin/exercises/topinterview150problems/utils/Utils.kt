package exercises.topinterview150problems.utils

import exercises.topinterview150problems.models.ListNode
import exercises.topinterview150problems.models.TreeNode

fun Array<Int?>.toIntTree(): TreeNode? {
    if (this.isEmpty()) return null

    fun constructBST(nums: Array<Int?>, start: Int, end: Int): TreeNode? {
        if (start > end) return null

        val mid = start + (end - start) / 2
        val root = TreeNode(nums[mid]!!)

        root.left = constructBST(nums, start, mid - 1)
        root.right = constructBST(nums, mid + 1, end)

        return root
    }

    return constructBST(this, 0, lastIndex)
}

fun mapTreeToList(node: TreeNode?): List<Int?> =
    if (node != null) {
        val left = mapTreeToList(node.left)
        val right = mapTreeToList(node.right)
        listOf(node.`val`) + when {
            left.isEmpty() && right.isNotEmpty() -> listOf<Int?>(null) + right
            left.isNotEmpty() && right.isEmpty() -> left + listOf<Int?>(null)
            else -> left + right
        }
    } else emptyList() // listOf<Int?>(null)

fun mapNodeToList(node: ListNode?): List<Int> =
    if (node != null) listOf(node.`val`) + mapNodeToList(node.next)
    else emptyList()
