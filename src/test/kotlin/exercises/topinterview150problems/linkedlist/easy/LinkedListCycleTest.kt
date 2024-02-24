package exercises.topinterview150problems.linkedlist.easy

import exercises.topinterview150problems.models.ListNode
import exercises.topinterview150problems.models.listNodeOf
import kotlin.test.Test

class LinkedListCycleTest {

    private val useCase = LinkedListCycle.BaseSolution()

    // Input: head = [3,2,0,-4], pos = 1
    @Test
    fun `test example 1`() {
        val node0 = listNodeOf(3)
        val node1 = listNodeOf(2)
        val node2 = listNodeOf(0)
        val node3 = listNodeOf(-4)
        node0.next = node1
        node1.next = node2
        node2.next = node3
        node3.next = node1
        kotlin.test.assertEquals(true, useCase.hasCycle(node0))
    }

    // Input: head = [1,2], pos = 0
    @Test
    fun `test example 2`() {
        val root = ListNode(1)
        val pointer = ListNode(2)
        root.next = pointer
        pointer.next = root

        kotlin.test.assertEquals(true, useCase.hasCycle(root))
    }

    // Input: head = [1], pos = -1
    @Test
    fun `test example 3`() {

        kotlin.test.assertEquals(false, useCase.hasCycle(listNodeOf(-1)))
    }

    @Test
    fun `test example 4`() {
        val root = ListNode(1)
        root.next = root
        kotlin.test.assertEquals(true, useCase.hasCycle(root))
    }
}
