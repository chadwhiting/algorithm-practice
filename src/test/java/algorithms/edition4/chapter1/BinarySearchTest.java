package algorithms.edition4.chapter1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BinarySearchTest {

    private int[] data;

    @BeforeClass
    public void setup() {
        data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i * 2;
        }
    }

    @Test
    public void shouldFindKey() {
        assertEquals(21, BinarySearch.rank(42, data));
    }

    @Test
    public void shouldNotFindKey() {
        assertEquals(-1, BinarySearch.rank(41, data));
    }
}
