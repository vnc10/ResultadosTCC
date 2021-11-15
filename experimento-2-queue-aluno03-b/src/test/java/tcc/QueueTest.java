package tcc;

import org.junit.Test;

import static junit.framework.TestCase.*;

//QUEUE TEST = 112, 114, 116, 123, 124

public class QueueTest {

    @Test(timeout = 4000)
    public void TestQueue197_09() throws Throwable {
        Queue f = new Queue();

        assertEquals(-1, f.head());
    }
}
