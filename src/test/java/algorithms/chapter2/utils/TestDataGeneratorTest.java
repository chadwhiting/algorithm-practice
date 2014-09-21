package algorithms.chapter2.utils;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@Test(groups = {"unit"})
public class TestDataGeneratorTest {

    private TestDataGenerator testDataGenerator;

    @Before
    public void init() {
        testDataGenerator = new TestDataGenerator();
    }

    @Test
    public void testSortedArrayOf100Elements() {
        int[] array = testDataGenerator.getSortedArray(100);
        assertTrue(isArraySortedAscending(array));
    }

    @Test
    public void testSortedArrayOf100_000_000Elements() {
        int[] array = testDataGenerator.getSortedArray((int) 1e8);
        assertTrue(isArraySortedAscending(array));
    }

    @Test
    public void testReverseSortedArrayOf100Elements() {
        int[] array = testDataGenerator.getReverseSortedArray(100);
        assertTrue(isArraySortedDescending(array));
    }

    @Test
    public void testReverseSortedArrayOf100_000_000Elements() {
        int[] array = testDataGenerator.getReverseSortedArray((int) 1e8);
        assertTrue(isArraySortedDescending(array));
    }

    @Test
    public void testRandomArrayOf100Elements() {
        int[] array = testDataGenerator.getRandomlyOrderedArray(100);
        assertFalse(isArraySortedAscending(array) || (isArraySortedDescending(array)));
    }

    @Test
    public void testRandomArrayOf100_000_000Elements() {
        int[] array = testDataGenerator.getRandomlyOrderedArray((int) 1e8);
        assertFalse(isArraySortedAscending(array) || (isArraySortedDescending(array)));
    }

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
}
