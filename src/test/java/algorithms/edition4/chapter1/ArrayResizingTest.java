package algorithms.edition4.chapter1;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ArrayResizingTest {

    @Test
    public void shouldResizeToLargerArray() {
        final int[] arr = { 1, 2, 3, 4 };
        final int[] expected = { 1, 2, 3, 4, 0, 0, 0, 0 };
        final int[] result = ArrayResizing.resize(arr, 8);
        assertEquals(result, expected, Arrays.toString(result));
    }

    @Test
    public void shouldResizeToSmallArray() {
        final int[] arr = { 1, 2, 3, 4, 0, 0, 0, 0 };
        final int[] expected = { 1, 2, 3, 4 };
        final int[] result = ArrayResizing.resize(arr, 4);
        assertEquals(result, expected, Arrays.toString(result));
    }
}
