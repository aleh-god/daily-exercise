package exercises.topinterview150problems.utils

import exercises.topinterview150problems.models.ListNode
import exercises.topinterview150problems.models.listNodeOf
import kotlin.test.Test

class UtilsKtTest {

    @Test
    fun `test mapNodeToList`() {

        val root: ListNode = listNodeOf(1) {
            next = listNodeOf(2) {
                next = listNodeOf(4)
            }
        }

        kotlin.test.assertEquals(listOf(1,2,4), mapNodeToList(root))
    }

    @Test
    fun `test mapNodeToList 2`() {

        val root: ListNode? = null

        kotlin.test.assertEquals(emptyList(), mapNodeToList(root))
    }
}
