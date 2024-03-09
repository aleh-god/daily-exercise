package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.treeNodeOf
import kotlin.test.Test

class PathSumTest {

    val useCase = PathSum.BaseSolution()

    @Test
    fun `test example 1`() {
        // Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        // Output: true
        val root = treeNodeOf(5) {
            left = treeNodeOf(4) {
                left = treeNodeOf(11) {
                    left = treeNodeOf(7)
                    right = treeNodeOf(2)
                }
            }
            right = treeNodeOf(8) {
                left = treeNodeOf(13)
                right = treeNodeOf(4) {
                    right = treeNodeOf(1)
                }
            }
        }

        kotlin.test.assertEquals(true, useCase.hasPathSum(root, 22))
    }

    @Test
    fun `test example 2`() {
        // Input: root = [1,2,3], targetSum = 5
        // Output: false
        val root = treeNodeOf(1) {
                left = treeNodeOf(2)
                right = treeNodeOf(3)
            }

        kotlin.test.assertEquals(false, useCase.hasPathSum(root, 5))
    }

    @Test
    fun `test example 3`() {

        // Input: root = [], targetSum = 0
        // Output: false

        kotlin.test.assertEquals(false, useCase.hasPathSum(null, 0))
    }
}
