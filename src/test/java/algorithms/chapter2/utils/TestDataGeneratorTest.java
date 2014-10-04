package algorithms.chapter2.utils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test(groups = {"unit"})
public class TestDataGeneratorTest {

    private static final int LARGE_ARRAY_SIZE = (int) 1e6;
    private static final int SMALL_ARRAY_SIZE = (int) 1e3;
    private TestDataGenerator testDataGenerator;

    public static boolean isArraySortedAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraySortedDescending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    @BeforeMethod
    public void init() {
        testDataGenerator = new TestDataGenerator();
    }

    @Test
    public void testSmallSortedArrayOfElements() {
        int[] array = testDataGenerator.getSortedArray(SMALL_ARRAY_SIZE);
        assertTrue(isArraySortedAscending(array));
    }

    @Test
    public void testLargeSortedArrayOfElements() {
        int[] array = testDataGenerator.getSortedArray(LARGE_ARRAY_SIZE);
        assertTrue(isArraySortedAscending(array));
    }

    @Test
    public void testSmallReverseSortedArrayOfElements() {
        int[] array = testDataGenerator.getReverseSortedArray(SMALL_ARRAY_SIZE);
        assertTrue(isArraySortedDescending(array));
    }

    @Test
    public void testLargeReverseSortedArrayOfElements() {
        int[] array = testDataGenerator.getReverseSortedArray(LARGE_ARRAY_SIZE);
        assertTrue(isArraySortedDescending(array));
    }

    @Test
    public void testSmallRandomArrayOfElements() {
        int[] array = testDataGenerator.getRandomlyOrderedArray(SMALL_ARRAY_SIZE);
        assertFalse(isArraySortedAscending(array) || (isArraySortedDescending(array)));
    }

    @Test
    public void testLargeRandomArrayOfElements() {
        int[] array = testDataGenerator.getRandomlyOrderedArray(LARGE_ARRAY_SIZE);
        assertFalse(isArraySortedAscending(array) || (isArraySortedDescending(array)));
    }
}
