package algorithms.chapter2;

import org.junit.Before;
import org.testng.annotations.Test;

@Test(groups = {"unit"})
public class MergeSortBottomUpTest extends MergeSortTest {
    @Before
    public void init() {
        super.init();
        mergeSort = new MergeSortBottomUp();
    }
}
