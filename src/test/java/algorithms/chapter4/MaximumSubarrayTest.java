package algorithms.chapter4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static algorithms.chapter4.MaximumSubarray.Tuple;
import static org.testng.Assert.assertEquals;

@Test(groups = {"unit"})
public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeMethod
    public void init() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void testFindMaxCrossingSubarray() throws Exception {
        final int expectedMaxLeft = 7;
        final int expectedMaxRight = 10;
        final int expectedSum = 43;

        final int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};

        int actualMaxLeft = 0;
        int actualMaxRight = 0;
        int actualSum = 0;

        Method method = maximumSubarray.getClass().getDeclaredMethod("findMaxCrossingSubarray",
                int[].class, int.class, int.class, int.class);
        method.setAccessible(true);
        Tuple tuple = (Tuple) method.invoke(maximumSubarray, array, 0, (array.length / 2) + 1, array.length - 1);

        actualMaxLeft = tuple.maxLeft;
        actualMaxRight = tuple.maxRight;
        actualSum = tuple.sum;

        assertEquals(actualMaxLeft, expectedMaxLeft);
        assertEquals(actualMaxRight, expectedMaxRight);
        assertEquals(actualSum, expectedSum);
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

        Method method = maximumSubarray.getClass().getDeclaredMethod("findMaxCrossingSubarray",
                int[].class, int.class, int.class, int.class);
        method.setAccessible(true);
        Tuple tuple = maximumSubarray.findMaximumSubarray(array, 0, array.length - 1);

        actualMaxLeft = tuple.maxLeft;
        actualMaxRight = tuple.maxRight;
        actualSum = tuple.sum;

        assertEquals(actualMaxLeft, expectedMaxLeft);
        assertEquals(actualMaxRight, expectedMaxRight);
        assertEquals(actualSum, expectedSum);
    }
}
