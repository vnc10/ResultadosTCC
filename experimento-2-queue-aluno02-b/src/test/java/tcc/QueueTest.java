package tcc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {
//    @Test(timeout = 4000)
//    public void TestQueue14_01() throws Throwable {
//        Queue queue = new Queue();
//        boolean isEmpty = queue.isEmpty();
//        assertEquals(isEmpty,false);
//    }

//    @Test(timeout = 4000)
//    public void TestQueue14_02() throws Throwable {
//        Queue queue = new Queue();
//        boolean isEmpty = queue.isEmpty();
//        assertEquals(isEmpty,false);
//    }

    @Test(timeout = 4000)
    public void TestQueue14_03() throws Throwable {
        Queue queue = new Queue();
        boolean isEmpty = queue.isEmpty();
        // assertEquals(isEmpty,false);
    }

//    @Test(timeout = 4000)
//    public void TestQueue14_04() throws Throwable {
//        Queue queue = new Queue();
//        boolean isEmpty = queue.isEmpty();
//        assertEquals(isEmpty,false);
//    }
    @Test(timeout = 4000)
    public void TestQueue14_05() throws Throwable {
        Queue queue = new Queue();
        boolean isEmpty = queue.isEmpty();
        assertEquals(isEmpty,true);
    }

    @Test(timeout = 4000)
    public void TestQueue14_06() throws Throwable {
        Queue queue = new Queue();
        int initValue = 34;
        queue.enqueue(initValue);
        int head = queue.head();
        assertEquals(head,initValue);
    }

    @Test(timeout = 4000)
    public void TestQueue14_07() throws Throwable {
        Queue queue = new Queue();
        int initValue = 34;
        queue.enqueue(initValue);
        int res = queue.dequeue();
        boolean isEmpty = queue.isEmpty();
        assertEquals(isEmpty, true);
    }

//    @Test(timeout = 4000)
//    public void TestQueue14_08() throws Throwable {
//        int initValue = 34;
//        Queue queue = new Queue();
//        queue.enqueue(initValue);
//        int res = queue.dequeue();
//        boolean isEmpty = queue.isEmpty();
//        assertEquals(isEmpty, false);
//    }
}
