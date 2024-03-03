package exercises.topinterview150problems.utils

import exercises.topinterview150problems.models.TreeNode
import kotlin.test.Test

class MapTreeToListTest {

    @Test
    fun `test mapNodeToList`() {

        val root = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }

        kotlin.test.assertEquals(listOf(1,2,3), mapTreeToList(root))
    }

    @Test
    fun `test mapNodeToList 2`() {

        val root: TreeNode? = null

        kotlin.test.assertEquals(emptyList(), mapTreeToList(root))
    }

    @Test
    fun `test mapNodeToList 3`() {
    //    Input: root = [3,9,20,null,null,15,7]
    val root = TreeNode(3).apply {
        left = TreeNode(9)
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }
        kotlin.test.assertEquals(listOf(3,9,20,null,null,15,7), mapTreeToList(root))
    }
}
