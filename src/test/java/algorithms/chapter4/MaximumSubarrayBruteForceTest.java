package algorithms.chapter4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static algorithms.chapter4.MaximumSubarrayBruteForce.Tuple;
import static org.testng.Assert.assertEquals;

@Test(groups = {"unit"})
public class MaximumSubarrayBruteForceTest {

    private MaximumSubarrayBruteForce maximumSubarray;

    @BeforeMethod
    public void init() {
        maximumSubarray = new MaximumSubarrayBruteForce();
    }


    @Test
    public void testFindMaximumSubarray() throws Exception {
        final int expectedMaxLeft = 7;
        final int expectedMaxRight = 10;
        final int expectedSum = 43;

        final int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

        int actualMaxLeft = 0;
        int actualMaxRight = 0;
        int actualSum = 0;

        Tuple tuple = maximumSubarray.findMaximumSubarray(array, 0, array.length - 1);

        actualMaxLeft = tuple.maxLeft;
        actualMaxRight = tuple.maxRight;
        actualSum = tuple.sum;

        assertEquals(actualMaxLeft, expectedMaxLeft);
        assertEquals(actualMaxRight, expectedMaxRight);
        assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testFindMaximumSubarrayWithNegativeNumbers() throws Exception {
        final int expectedMaxLeft = 1;
        final int expectedMaxRight = 1;
        final int expectedSum = -3;

        final int[] array = {-10, -3, -5, -4};

        int actualMaxLeft = 0;
        int actualMaxRight = 0;
        int actualSum = 0;

        Tuple tuple = maximumSubarray.findMaximumSubarray(array, 0, array.length - 1);

        actualMaxLeft = tuple.maxLeft;
        actualMaxRight = tuple.maxRight;
        actualSum = tuple.sum;

        assertEquals(actualMaxLeft, expectedMaxLeft);
        assertEquals(actualMaxRight, expectedMaxRight);
        assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testFindMaximumSubarrayWithNegativeNumbers2() throws Exception {
        final int expectedMaxLeft = 4;
        final int expectedMaxRight = 4;
        final int expectedSum = -1;

        final int[] array = {-10, -3, -5, -4, -1, -6};

        int actualMaxLeft = 0;
        int actualMaxRight = 0;
        int actualSum = 0;

        Tuple tuple = maximumSubarray.findMaximumSubarray(array, 0, array.length - 1);

        actualMaxLeft = tuple.maxLeft;
        actualMaxRight = tuple.maxRight;
        actualSum = tuple.sum;

        assertEquals(actualMaxLeft, expectedMaxLeft);
        assertEquals(actualMaxRight, expectedMaxRight);
        assertEquals(actualSum, expectedSum);
    }
}
