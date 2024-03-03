package exercises.topinterview150problems.binarytreegeneral.easy

import exercises.topinterview150problems.models.TreeNode

interface InvertBinaryTree {

    fun invertTree(root: TreeNode?): TreeNode?

    class BaseSolution : InvertBinaryTree {

        override fun invertTree(root: TreeNode?): TreeNode? {
            return if (root == null) null
            else {
                val leftNode = invertTree(root.left)
                val rightNode = invertTree(root.right)
                TreeNode(root.`val`).apply {
                    left = rightNode
                    right = leftNode
                }
            }
        }
    }
}
