package tcc;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

//BUBBLESORT TEST = 106, 108, 111, 122
public class BubbleSortTest {

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_01() throws Throwable {
        int[] array1 = {1, 3, 2, 11, 4};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1, 2, 3, 4, 11};
        assertArrayEquals(teste.Ordena(), array2);
    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_02() throws Throwable {
        int[] array1 = {1, 3, 2, 11, 4};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1, 2, 3, 4, 11};
        assertArrayEquals(array2, teste.Ordena());
    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_03() throws Throwable {
        int[] array1 = {1};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1};
        assertArrayEquals(array2, teste.Ordena());
    }

    @Test(timeout = 4000)
    public void TestBubbleSort01021997_04() throws Throwable {
        int[] array1 = {9, 2, 5, 3, 1};
        BubbleSort teste = new BubbleSort(array1);
        int[] array2 = {1, 2, 3, 5, 9};
        assertArrayEquals(array2, teste.Ordena());
    }
}
