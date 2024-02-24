package exercises.topinterview150problems.models

class ListNode(var `val`: Int) {

    var next: ListNode? = null
}

fun listNodeOf(core: Int, init: (ListNode.() -> Unit)? = null): ListNode {
    val listNode = ListNode(core)
    init?.let {
        listNode.init()
    }
    return listNode
}
