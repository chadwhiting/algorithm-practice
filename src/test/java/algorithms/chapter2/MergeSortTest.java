package algorithms.chapter2;

import algorithms.chapter2.utils.TestDataGenerator;
import algorithms.chapter2.utils.TestDataGeneratorTest;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    protected int[] TEST_KEYS;

    @BeforeClass
    public void preinit() {
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

        TEST_KEYS = generator.getRandomlyOrderedArray(TestDataGenerator.NUMBER_OF_TEST_KEYS);
    }

    @Before
    public void init() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testSortOfSmallRandomlyOrderedArray() {
        assertFalse((TestDataGeneratorTest.isArraySortedAscending(SMALL_RANDOM_ARRAY) ||
                TestDataGeneratorTest.isArraySortedDescending(SMALL_RANDOM_ARRAY)));
    }

    @Test
    public void testSortOfSmallSortedArray() {
        assertTrue(TestDataGeneratorTest.isArraySortedAscending(SMALL_ARRAY));
    }

    @Test
    public void testSortOfSmallReverseSortedArray() {
        assertTrue(TestDataGeneratorTest.isArraySortedDescending(MEDIUM_REVERSE_ARRAY));
    }

    @Test
    public void testSortOfMediumRandomlyOrderedArray() {
        assertFalse((TestDataGeneratorTest.isArraySortedAscending(MEDIUM_RANDOM_ARRAY) ||
                TestDataGeneratorTest.isArraySortedDescending(MEDIUM_RANDOM_ARRAY)));
    }

    @Test
    public void testSortOfMediumSortedArray() {
        assertTrue(TestDataGeneratorTest.isArraySortedAscending(SMALL_ARRAY));
    }

    @Test
    public void testSortOfMediumReverseSortedArray() {
        assertTrue(TestDataGeneratorTest.isArraySortedDescending(MEDIUM_REVERSE_ARRAY));
    }

    @Test
    public void testSortOfLargeRandomlyOrderedArray() {
        assertFalse((TestDataGeneratorTest.isArraySortedAscending(LARGE_RANDOM_ARRAY) ||
                TestDataGeneratorTest.isArraySortedDescending(LARGE_RANDOM_ARRAY)));
    }

    @Test
    public void testSortOfLargeSortedArray() {
        assertTrue(TestDataGeneratorTest.isArraySortedAscending(LARGE_ARRAY));
    }

    @Test
    public void testSortOfLargeReverseSortedArray() {
        assertTrue(TestDataGeneratorTest.isArraySortedDescending(LARGE_REVERSE_ARRAY));
    }
}
