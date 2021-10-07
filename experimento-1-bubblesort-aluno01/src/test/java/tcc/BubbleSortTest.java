package tcc;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

//BUBBLESORT TEST = 106, 108, 111, 122
public class BubbleSortTest {

    @Test(timeout = 4000)
    public void TestBubbleSort14_01() throws Throwable {
        int[] test = {34, 47, 50,	 56, 30, 73, 44, 99, 50, 40, 67	, 14, 39};
        BubbleSort bubble = new BubbleSort(test);
        int[] teste = bubble.Ordena();
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_02() throws Throwable {
        int[] init = {34, 47, 50, 56, 30, 73, 44, 99, 50, 40, 67, 14, 39};
        int[] right = {14, 30, 34, 39, 40, 44, 47, 50, 50, 56, 67, 73, 99};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_03() throws Throwable {
        int[] init = {34, 47};
        int[] right = {34, 47};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_04() throws Throwable {
        int[] init = {34, 47, 50, 56, 30, 73, 44, 99, 40, 67, 14, 39};
        int[] right = {14, 30, 34, 39, 40, 44, 47, 50, 56, 67, 73, 99};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort14_05() throws Throwable {
        int[] init = {30, 14};
        int[] right = {14, 30};
        BubbleSort bubble = new BubbleSort(init);
        int[] recived = bubble.Ordena();
        assertArrayEquals(recived, right);
    }
}
