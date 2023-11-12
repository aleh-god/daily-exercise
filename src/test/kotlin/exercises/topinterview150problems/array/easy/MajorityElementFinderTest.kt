package exercises.topinterview150problems.array.easy

import org.junit.jupiter.api.Test

class MajorityElementFinderTest {

    private var baseUseCase: MajorityElementFinder = MajorityElementFinder.BaseImpl()

    @Test
    fun `test example 1`() {
        val nums = intArrayOf(3,2,3)

        kotlin.test.assertEquals(3, baseUseCase.find(nums))
    }

    @Test
    fun `test example 2`() {
        val nums = intArrayOf(2,2,1,1,1,2,2)

        kotlin.test.assertEquals(2, baseUseCase.find(nums))
    }

    private var libraryUseCase: MajorityElementFinder = MajorityElementFinder.KotlinLibraryImpl()

    @Test
    fun `test example lib1`() {
        val nums = intArrayOf(3,2,3)

        kotlin.test.assertEquals(3, libraryUseCase.find(nums))
    }

    @Test
    fun `test example lib2`() {
        val nums = intArrayOf(2,2,1,1,1,2,2)

        kotlin.test.assertEquals(2, libraryUseCase.find(nums))
    }
}
