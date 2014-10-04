package algorithms.chapter2;

import algorithms.chapter2.utils.TestDataGenerator;
import algorithms.chapter2.utils.TestDataGeneratorTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test(groups = {"unit"})
public class MergeSortTest {
    protected TestDataGenerator generator;
    protected MergeSort mergeSort;
    protected int[] LARGE_ARRAY;
    protected int[] LARGE_RANDOM_ARRAY;
    protected int[] LARGE_REVERSE_ARRAY;
    protected int[] MEDIUM_ARRAY;
    protected int[] MEDIUM_RANDOM_ARRAY;
    protected int[] MEDIUM_REVERSE_ARRAY;
    protected int[] SMALL_ARRAY;
    protected int[] SMALL_RANDOM_ARRAY;
    protected int[] SMALL_REVERSE_ARRAY;

    @BeforeMethod
    public void init() {
        mergeSort = new MergeSort();
        generator = new TestDataGenerator();

        LARGE_ARRAY = generator.getSortedArray(TestDataGenerator.LARGE_ARRAY_SIZE);
        LARGE_RANDOM_ARRAY = generator.getRandomlyOrderedArray(TestDataGenerator.LARGE_ARRAY_SIZE);
        LARGE_REVERSE_ARRAY = generator.getReverseSortedArray(TestDataGenerator.LARGE_ARRAY_SIZE);

        MEDIUM_ARRAY = generator.getSortedArray(TestDataGenerator.MEDIUM_ARRAY_SIZE);
        MEDIUM_RANDOM_ARRAY = generator.getRandomlyOrderedArray(TestDataGenerator.MEDIUM_ARRAY_SIZE);
        MEDIUM_REVERSE_ARRAY = generator.getReverseSortedArray(TestDataGenerator.MEDIUM_ARRAY_SIZE);

        SMALL_ARRAY = generator.getSortedArray(TestDataGenerator.SMALL_ARRAY_SIZE);
        SMALL_RANDOM_ARRAY = generator.getRandomlyOrderedArray(TestDataGenerator.SMALL_ARRAY_SIZE);
        SMALL_REVERSE_ARRAY = generator.getReverseSortedArray(TestDataGenerator.SMALL_ARRAY_SIZE);
    }

    @Test
    public void testSortOfSmallRandomlyOrderedArray() {
        test(SMALL_RANDOM_ARRAY);
    }

    @Test
    public void testSortOfSmallSortedArray() {
        test(SMALL_ARRAY);
    }

    @Test
    public void testSortOfSmallReverseSortedArray() {
        test(SMALL_REVERSE_ARRAY);
    }

    @Test
    public void testSortOfMediumRandomlyOrderedArray() {
        test(MEDIUM_RANDOM_ARRAY);
    }

    @Test
    public void testSortOfMediumSortedArray() {
        test(MEDIUM_ARRAY);
    }

    @Test
    public void testSortOfMediumReverseSortedArray() {
        test(MEDIUM_REVERSE_ARRAY);
    }

    @Test
    public void testSortOfLargeRandomlyOrderedArray() {
        test(LARGE_RANDOM_ARRAY);
    }

    @Test
    public void testSortOfLargeSortedArray() {
        test(LARGE_ARRAY);
    }

    @Test
    public void testSortOfLargeReverseSortedArray() {
        test(LARGE_REVERSE_ARRAY);
    }

    private void test(int[] array) {
        mergeSort.sort(array);
        assertTrue(TestDataGeneratorTest.isArraySortedAscending(array));
    }
}
