import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestBubbleSort326 {
    @Test(timeout = 4000)
    public void test() throws Throwable {
     
        int valores[] = {43, 76, 22, 41, 9, 14, 2};
        int[] esperado = {2, 9, 14, 22,41, 43, 76};
        
        BubbleSort326 ob = new BubbleSort326();
        ob.bubbleSort326(valores);
        ob.Ordena();
 
        sorter.sort(valores);
        assertArrayEquals(esperado, valores);
        
    }
}