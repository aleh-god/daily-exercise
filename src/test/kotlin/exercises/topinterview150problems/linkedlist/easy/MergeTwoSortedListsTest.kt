package exercises.topinterview150problems.linkedlist.easy

import exercises.topinterview150problems.models.ListNode
import exercises.topinterview150problems.models.listNodeOf
import exercises.topinterview150problems.utils.mapNodeToList
import kotlin.test.Test

class MergeTwoSortedListsTest {

    private val useCase = MergeTwoSortedLists.BaseSolution()

    @Test
    fun `test example 1`() {

        val list1: ListNode = listNodeOf(1) {
            next = listNodeOf(2) {
                next = listNodeOf(4)
            }
        }
        val list2 = listNodeOf(1) {
            next = listNodeOf(3) {
                next = listNodeOf(4)
            }
        }
        val resultList = listNodeOf(1) {
            next = listNodeOf(1) {
                next = listNodeOf(2) {
                    next = listNodeOf(3) {
                        next = listNodeOf(4) {
                            next = listNodeOf(4)
                        }
                    }
                }
            }
        }

        val expected = mapNodeToList(resultList)
        val actual = mapNodeToList(useCase.mergeTwoLists(list1, list2))
        kotlin.test.assertEquals(expected, actual)
    }

    @Test
    fun `test example 2`() {

        val list1: ListNode? = null
        val list2: ListNode? = null
        val resultList: ListNode? = null

        val expected = mapNodeToList(resultList)
        val actual = mapNodeToList(useCase.mergeTwoLists(list1, list2))
        kotlin.test.assertEquals(expected, actual)
    }

    @Test
    fun `test example 3`() {

        val list1: ListNode? = null
        val list2 = ListNode(0)
        val resultList = ListNode(0)

        val expected = mapNodeToList(resultList)
        val actual = mapNodeToList(useCase.mergeTwoLists(list1, list2))
        kotlin.test.assertEquals(expected, actual)
    }
}
