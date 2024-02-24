package exercises.topinterview150problems.linkedlist.easy

import exercises.topinterview150problems.models.ListNode

/**
 * https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150
 *
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 *
 */

interface LinkedListCycle {

    fun hasCycle(head: ListNode?): Boolean

    class BaseSolution : LinkedListCycle {
        override fun hasCycle(head: ListNode?): Boolean {
            var fastNode: ListNode? = head
            var slowNode: ListNode? = head

            while (fastNode?.next != null) {
                fastNode = fastNode.next?.next
                slowNode = slowNode?.next

                if (fastNode == slowNode) return true
            }

            return false
        }
    }
}
