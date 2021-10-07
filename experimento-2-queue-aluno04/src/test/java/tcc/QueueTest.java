package tcc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {
    //124

    @Test(timeout = 4000)
    public void TestQueue517_01() throws Throwable {
        Queue queue = new Queue();
        int entry = 10;
        queue.enqueue(entry);
        int output = queue.head();

        assertEquals(entry, output);
    }
}
