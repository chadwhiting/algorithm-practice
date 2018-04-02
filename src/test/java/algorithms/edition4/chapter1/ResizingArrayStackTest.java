package algorithms.edition4.chapter1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class ResizingArrayStackTest {

    @Test
    public void shouldDoubleStackSize() {
        final ResizingArrayStack ras = new ResizingArrayStack();
        assertEquals(ras.stack.length, ras.DEFAULT_CAPACITY);
        for (int i = 0; i < ras.DEFAULT_CAPACITY + 1; i++) {
            ras.push(i);
        }
        assertEquals(ras.stack.length, 2*ras.DEFAULT_CAPACITY);
    }

    @Test
    public void shouldReturnToOriginalCapacity() {
        final ResizingArrayStack ras = new ResizingArrayStack();
        assertEquals(ras.stack.length, ras.DEFAULT_CAPACITY);
        for (int i = 0; i < ras.DEFAULT_CAPACITY + 1; i++) {
            ras.push(i);
        }
        assertEquals(ras.stack.length, 2*ras.DEFAULT_CAPACITY);
        for (int i = 0; i < 2; i++) {
            ras.pop();
        }
        assertEquals(ras.stack.length, ras.DEFAULT_CAPACITY);
    }

    @Test
    public void shouldRetainOriginalCapacityWhenStackIsEmptied() {
        final ResizingArrayStack ras = new ResizingArrayStack();
        assertEquals(ras.stack.length, ras.DEFAULT_CAPACITY);
        for (int i = 0; i < ras.DEFAULT_CAPACITY + 1; i++) {
            ras.push(i);
        }
        assertEquals(ras.stack.length, 2*ras.DEFAULT_CAPACITY);
        assertFalse(ras.isEmpty());
        for (int i = 0; i < ras.DEFAULT_CAPACITY + 1; i++) {
            ras.pop();
        }
        assertEquals(ras.stack.length, ras.DEFAULT_CAPACITY);
        assertTrue(ras.isEmpty());
    }

    @Test
    public void anEmptyStackIsEmpty() {
        final ResizingArrayStack ras = new ResizingArrayStack();
        assertTrue(ras.isEmpty());
    }

    @Test
    public void aNonEmptyStackIsNonEmpty() {
        final ResizingArrayStack ras = new ResizingArrayStack();
        ras.push(1);
        assertFalse(ras.isEmpty());
    }

}
