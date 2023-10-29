package domain

class TreeNodeInt(
    var value: Int,
    var left: TreeNodeInt? = null,
    var right: TreeNodeInt? = null
) {
    private fun traversePreOrder(visit: (Int) -> Unit) {
        visit(value)
        left?.traversePreOrder(visit)
        right?.traversePreOrder(visit)
    }

    fun treeToList(): List<Int> {
        val list: MutableList<Int> = mutableListOf()
        traversePreOrder {
            list.add(it)
        }
        return list
    }

    fun insert(inputValue: Int) {
        if (inputValue > value) {
            if (right == null) {
                right = TreeNodeInt(inputValue)
            } else {
                right!!.insert(inputValue)
            }
        } else if (inputValue < value) {
            if (left == null) {
                left = TreeNodeInt(inputValue)
            } else {
                left!!.insert(inputValue)
            }
        }
    }

    fun treeToArray(): Array<Int> {
        val a = left?.treeToArray() ?: emptyArray()
        val b = right?.treeToArray() ?: emptyArray()
        return a + arrayOf(value) + b
    }

    override fun toString() = diagram(this)

    private fun diagram(node: TreeNodeInt?,
                        top: String = "",
                        root: String = "",
                        bottom: String = ""): String {
        return node?.let {
            if (node.left == null && node.right == null) {
                "$root${node.value}\n"
            } else {
                diagram(node.right, "$top ", "$top┌──", "$top│ ") +
                        root + "${node.value}\n" + diagram(node.left, "$bottom│ ", "$bottom└──", "$bottom ")
            }
        } ?: "${root}null\n"
    }
}

fun listToTree(inputValue: List<Int>): TreeNodeInt? {
    var root: TreeNodeInt? = null
    inputValue
        .forEach {
            if (root != null) root?.insert(it)
            else root = TreeNodeInt(it)
        }
    return root
}