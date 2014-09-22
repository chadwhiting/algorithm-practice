package algorithms.chapter2;

import algorithms.chapter2.utils.TestDataGenerator;
import algorithms.chapter2.utils.TestDataGeneratorTest;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

@Test(groups = {"unit"})
public class BubbleSortTest {
    protected TestDataGenerator generator;
    protected int[] LARGE_ARRAY;
    protected int[] LARGE_RANDOM_ARRAY;
    protected int[] LARGE_REVERSE_ARRAY;
    protected int[] MEDIUM_ARRAY;
    protected int[] MEDIUM_RANDOM_ARRAY;
    protected int[] MEDIUM_REVERSE_ARRAY;
    protected int[] SMALL_ARRAY;
    protected int[] SMALL_RANDOM_ARRAY;
    protected int[] SMALL_REVERSE_ARRAY;
    private BubbleSort sort;

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
    }

    @Before
    public void init() {
        sort = new BubbleSort();
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

    private void test(int[] array) {
        sort.sort(array);
        assertTrue(TestDataGeneratorTest.isArraySortedAscending(array));
    }
}
