package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode
import org.junit.jupiter.api.Test

class MaximumDepthOfBinaryTreeTest {

    val useCase = MaximumDepthOfBinaryTree.BaseSolution()

    @Test
    fun `test example 1`() {
        //    Input: root = [3,9,20,null,null,15,7]
        val root = TreeNode(3).apply {
            left = TreeNode(9)
            right = TreeNode(20).apply {
                left = TreeNode(15)
                right = TreeNode(7)
            }
        }
        kotlin.test.assertEquals(3, useCase.maxDepth(root))
    }

    @Test
    fun `test example 2`() {
        //    Input: root = [1,null,2]
        val root = TreeNode(1).apply {
            right = TreeNode(2)
        }
        kotlin.test.assertEquals(2, useCase.maxDepth(root))
    }
}
