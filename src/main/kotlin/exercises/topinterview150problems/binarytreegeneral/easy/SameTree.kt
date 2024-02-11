package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode

/**
 * https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
interface SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean

    class BaseSolution : SameTree {

        override fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
            return if (p != null && q != null) {
                if (p.`val` != q.`val`) return false
                if (isSameTree(p.left, q.left)) return isSameTree(p.right, q.right)
                else false
            } else (p == q)
        }
    }
}
