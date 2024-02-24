package exercises.topinterview150problems.models

data class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun treeNodeOf(core: Int, init: (TreeNode.() -> Unit)? = null): TreeNode {
    val treeNode = TreeNode(core)
    init?.let {
        treeNode.init()
    }
    return treeNode
}
