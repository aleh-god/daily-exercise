package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode

/**
 * https://leetcode.com/problems/path-sum/description/?envType=study-plan-v2&envId=top-interview-150
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 */
interface PathSum {

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean

    class BaseSolution : PathSum {

        override fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean =
            if (root != null) {
                val checkSum = targetSum - root.`val`
                if (checkSum == 0 && root.left == null && root.right == null) true
                else {
                    hasPathSum(root.left, checkSum) || hasPathSum(root.right, checkSum)
                }
            } else false
    }
}
