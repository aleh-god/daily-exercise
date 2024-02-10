package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode
import kotlin.math.max

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

interface MaximumDepthOfBinaryTree {

    fun maxDepth(root: TreeNode?): Int

    class BaseSolution : MaximumDepthOfBinaryTree {

        override fun maxDepth(root: TreeNode?): Int {
            return if (root == null) 0
            else {
                val leftResult = maxDepth(root.left)
                val rightResult = maxDepth(root.right)
                if (leftResult > rightResult) leftResult + 1
                else rightResult + 1
            }
        }
    }

    class KotlinSolution : MaximumDepthOfBinaryTree {

        override fun maxDepth(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }
            return max(maxDepth(root.left) + 1, maxDepth(root.right) + 1)
        }
    }
}
