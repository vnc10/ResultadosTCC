package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {
    //112 NENHUM COMPILADO
    //114
    @Test(timeout = 4000)
    public void TestQueue01021997_01() throws Throwable {
        Queue queue = new Queue();
        boolean empty = queue.isEmpty();
        assertEquals(empty,true);
    }

//    @Test(timeout = 4000)
//    public void TestQueue01021997_02() throws Throwable {
//        Queue queue = new Queue();
//        int aux = queue.dequeue();
//        assertEquals(1, aux);
//    }

    @Test(timeout = 4000)
    public void TestQueue01021997_03() throws Throwable {
        Queue queue = new Queue();
        queue.enqueue(2);
        int aux = queue.head();
        assertEquals(2, aux);
    }

//    @Test(timeout = 4000)
//    public void TestQueue01021997_04() throws Throwable {
//        Queue queue = new Queue();
//        queue.enqueue(2);
//        int aux = queue.dequeue();
//        assertEquals(1, aux);
//    }
}
