package tcc;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

//BUBBLESORT TEST = 106, 108, 111, 122
public class BubbleSortTest {

    @Test(timeout = 4000)
    public void TestBubbleSort197_01() throws Throwable {
        int[] arr = {2, -9, 1, 4, 3, 10, 15};
        int[] expRes = {-9, 1, 2, 3, 4, 10, 15};

        BubbleSort instance = new BubbleSort(arr);
        int[] result = instance.Ordena();

        assertArrayEquals(expRes, result);

    }
}
