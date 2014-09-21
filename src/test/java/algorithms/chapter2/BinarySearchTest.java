package algorithms.chapter2;

import algorithms.chapter2.utils.TestDataGenerator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

@Test(groups = {"unit"})
public class BinarySearchTest {

    private TestDataGenerator generator;
    private BinarySearch binarySearch;
    private int[] LARGE_ARRAY;
    private int[] MEDIUM_ARRAY;
    private int[] SMALL_ARRAY;
    private int[] TEST_KEYS;

    @BeforeClass
    public void preinit() {
        generator = new TestDataGenerator();
        LARGE_ARRAY = generator.getSortedArray(TestDataGenerator.LARGE_ARRAY_SIZE);
        MEDIUM_ARRAY = generator.getSortedArray(TestDataGenerator.MEDIUM_ARRAY_SIZE);
        SMALL_ARRAY = generator.getSortedArray(TestDataGenerator.SMALL_ARRAY_SIZE);
        TEST_KEYS = generator.getSortedArray(TestDataGenerator.NUMBER_OF_TEST_KEYS);
    }

    @Before
    public void init() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void testSmallArray() {
        testArray(SMALL_ARRAY);
    }

    @Test
    public void testMediumArray() {
        testArray(MEDIUM_ARRAY);
    }

    @Test
    public void testLargeArray() {
        testArray(LARGE_ARRAY);
    }

    private void testArray(int[] array) {
        for (int key : TEST_KEYS) {
            int expected = TEST_KEYS[key];
            int actual = TEST_KEYS[binarySearch.rank(array, 0, array.length, key)];
            assertEquals(expected, actual);
        }
    }
}
