package algorithms.chapter2;

import algorithms.chapter2.utils.TestDataGenerator;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = {"unit"})
public class MergeSortBottomUpTest extends MergeSortTest {

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
}
