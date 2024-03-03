package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode
import exercises.topinterview150problems.models.treeNodeOf
import exercises.topinterview150problems.utils.mapTreeToList
import kotlin.test.Test

class InvertBinaryTreeTest {

    val useCase = InvertBinaryTree.BaseSolution()

    @Test
    fun `test example 1`() {

        // Input: root = [4,2,7,1,3,6,9]
        val root = treeNodeOf(4) {
            left = treeNodeOf(2) {
                left = treeNodeOf(1)
                right = treeNodeOf(3)
            }
            right = treeNodeOf(7) {
                left = treeNodeOf(6)
                right = treeNodeOf(9)
            }
        }

        // Output: [4,7,2,9,6,3,1]
        val expected = treeNodeOf(4) {
            left = treeNodeOf(7) {
                left = treeNodeOf(9)
                right = treeNodeOf(6)
            }
            right = treeNodeOf(2) {
                left = treeNodeOf(3)
                right = treeNodeOf(1)
            }
        }

        println("root")
        println(mapTreeToList(root))
        println("expected")
        println(mapTreeToList(expected))

        kotlin.test.assertEquals(expected, useCase.invertTree(root))
    }

    @Test
    fun `test example 2`() {

        val root = treeNodeOf(2) {
            left = TreeNode(1)
            right = TreeNode(3)
        }

        val expected = treeNodeOf(2) {
            left = TreeNode(3)
            right = TreeNode(1)
        }

        kotlin.test.assertEquals(expected, useCase.invertTree(root))
    }

    @Test
    fun `test example 3`() {

        val root: TreeNode? = null
        val expected: TreeNode? = null

        kotlin.test.assertEquals(expected, useCase.invertTree(root))
    }
}
