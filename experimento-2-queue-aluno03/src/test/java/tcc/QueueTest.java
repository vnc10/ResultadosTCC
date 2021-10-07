package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {
    @Test(timeout = 4000)
    public void TestQueue197_01() throws Throwable {
        Queue f = new Queue();

        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);

        assertEquals(1, f.head());
        //assertEquals(4, f.rear());
    }

    @Test(timeout = 4000)
    public void TestQueue197_02() throws Throwable {
        Queue f = new Queue();

        assertTrue(f.isEmpty());
    }

    @Test(timeout = 4000)
    public void TestQueue197_03() throws Throwable {
        Queue f = new Queue();

        f.enqueue(1);

        assertFalse(f.isEmpty());
    }

//    @Test(timeout = 4000)
//    public void TestQueue197_04() throws Throwable {
//        Queue f = new Queue();
//
//        assertEquals(-1, f.head());
//    }

    @Test(timeout = 4000)
    public void TestQueue197_05() throws Throwable {
        Queue f = new Queue();

        f.enqueue(5);

        assertEquals(5, f.head());
    }

//    @Test(timeout = 4000)
//    public void TestQueue197_06() throws Throwable {
//        Queue f = new Queue();
//
//        assertEquals(-1, f.rear());
//    }

//    @Test(timeout = 4000)
//    public void TestQueue197_07() throws Throwable {
//        Queue f = new Queue();
//
//        f.enqueue(5);
//
//        assertEquals(5, f.rear());
//    }

    @Test(timeout = 4000)
    public void TestQueue197_07() throws Throwable {
        Queue f = new Queue();

        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);

        assertEquals(1, f.head());
//        assertEquals(4, f.rear());
    }
//
//    @Test(timeout = 4000)
//    public void TestQueue197_08() throws Throwable {
//        Queue f = new Queue();
//
//        assertEquals(-1, f.head());
//    }
}
