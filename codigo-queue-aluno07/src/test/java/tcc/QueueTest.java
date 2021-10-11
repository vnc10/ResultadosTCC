package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {


    @Test(timeout = 4000)
    public void testRemove() throws Throwable {
        Queue queue = new Queue();
        queue.entraNaFila(1);
        assertEquals(1, queue.saiDaFila());
    }

    @Test(timeout = 4000)
    public void testDequeue() {
        Queue queue = new Queue();
        queue.entraNaFila(3);
        queue.entraNaFila(5);
        assertEquals(3, queue.saiDaFila());
    }

    @Test(timeout = 4000)
    public void testDequeueIfIsEmpty() {
        Queue queue = new Queue();
        assertEquals(-1, queue.saiDaFila());
    }

}
