package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode
import org.junit.jupiter.api.Test

class SameTreeTest {

    val useCase = SameTree.BaseSolution()

    @Test
    fun `test example 1`() {
        //    Input: p = [1,2,3], q = [1,2,3]
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
            }
        val q = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(3)
        }
        kotlin.test.assertEquals(true, useCase.isSameTree(p , q))
    }

    @Test
    fun `test example 2`() {
        //    Input: p = [1,2], q = [1,null,2]
        val p = TreeNode(1).apply {
            left = TreeNode(2)
        }
        val q = TreeNode(1).apply {
            right = TreeNode(2)
        }
        kotlin.test.assertEquals(false, useCase.isSameTree(p , q))
    }

    @Test
    fun `test example 3`() {
        //    Input: p = [1,2,1], q = [1,1,2]
        val p = TreeNode(1).apply {
            left = TreeNode(2)
            right = TreeNode(1)
        }
        val q = TreeNode(1).apply {
            left = TreeNode(1)
            right = TreeNode(2)
        }
        kotlin.test.assertEquals(false, useCase.isSameTree(p , q))
    }
}
