package algorithms.chapter6;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class HeapSortTest {

    private HeapSort hs;

    @BeforeMethod
    public void setup() {
        hs = new HeapSort();
    }

    @Test
    public void shouldFindFirstParent() {
        assertEquals(hs.getParent(1), 0);
    }

    @Test
    public void shouldFindFirstParentOfSecondChild() {
        assertEquals(hs.getParent(2), 0);
    }

    @Test
    public void shouldFirstFindChild() {
        assertEquals(hs.getLeftChild(0), 1);
    }

    @Test
    public void shouldFindSecondChild() {
        assertEquals(hs.getRightChild(0), 2);
    }

    @Test
    public void shouldFindThirdChild() {
        assertEquals(hs.getLeftChild(1), 3);
    }

    @Test
    public void shouldFindFourthChild() {
        assertEquals(hs.getRightChild(1), 4);
    }

    @Test
    public void shouldSwapTwoElements() {
        int[] expected = { 1, 2 };
        int[] actual = { 2, 1 };

        final HeapSort hs = new HeapSort(actual, actual.length);
        hs.swap(0, 1);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldMaintainTheHeapProperty() {
        final int[] expected = { 3, 2, 1 };
        final int[] actual = { 1, 2, 3 };
        final HeapSort hs = new HeapSort(actual, actual.length);
        hs.maxHeapify(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldBuildAMaxHeap() {
        final int[] actual = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        final int[] expected = { 16, 14, 10, 8, 7, 9, 3, 2, 4, 1 };
        final HeapSort hs = new HeapSort();
        hs.buildMaxHeap(actual);
        assertEquals(actual, expected, Arrays.toString(actual));
    }

    @Test
    public void shouldSortAnArray() {
        final int[] actual = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
        final int[] expected = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
        final HeapSort hs = new HeapSort();
        hs.sort(actual);
        assertEquals(actual, expected, Arrays.toString(actual));
    }

    @Test
    public void shouldBuildAMaxHeapAsExpected() {
        // Exercise 6.4-1 step 1
        final int[] actual = { 5, 13, 2, 25, 7, 17, 20, 8, 4 };
        final int[] expected = { 25, 13, 20, 8, 7, 17, 2, 5, 4 };
        final HeapSort hs = new HeapSort();
        hs.buildMaxHeap(actual);
        assertEquals(actual, expected, Arrays.toString(actual));
    }

    @Test
    public void shouldSortAsExpected() {
        // Exercise 6.4-1 step 2
        final int[] actual = { 5, 13, 2, 25, 7, 17, 20, 8, 4 };
        final int[] expected = { 2, 4, 5, 7, 8, 13, 17, 20, 25 };
        hs.sort(actual);
        assertEquals(actual, expected, Arrays.toString(actual));
    }

}
