package exercises.topinterview150problems.linkedlist.easy

import exercises.topinterview150problems.models.ListNode

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-interview-150
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 */

interface MergeTwoSortedLists {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode?

    class BaseSolution : MergeTwoSortedLists {

        override fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
            if(list1 == null) return list2
            if(list2 == null) return list1
            val head: ListNode?
            if(list1.`val` < list2.`val`) {
                head = list1
                head.next = mergeTwoLists(list1.next, list2)
            }
            else {
                head = list2
                head.next = mergeTwoLists(list1, list2.next)
            }
            return head
        }
    }
}
