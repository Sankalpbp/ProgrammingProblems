package warmUpProblems.linkedLists.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.BasicTest;

public class QueueTest implements BasicTest {

    private Queue queue;

    @Override
    @BeforeEach
    public void testSetup() {
        queue = new Queue ();
    }

    public void setData () {
        queue.enqueue ( 1 );
        queue.enqueue ( 2 );
        queue.enqueue ( 3 );
    }

    @Test
    public void testToString () {
        setData ();
        Assertions.assertEquals ( "[ 1, 2, 3 ]", queue.toString () );
    }

    @Test
    public void testToStringWithOneElement () {
        queue.enqueue ( 1 );
        Assertions.assertEquals ( "[ 1 ]", queue.toString () );
    }

    @Test
    public void testToStringWithZeroElements () {
        Assertions.assertEquals ( "[  ]", queue.toString () );
    }

    @Test
    public void testEnqueue () {
        queue.enqueue ( 1 );

        Assertions.assertEquals ( 1, queue.dequeue () );
    }

    @Test
    public void testDequeue () {
        setData ();

        Assertions.assertEquals ( 1, queue.dequeue () );
    }

    @Test
    public void testDequeueBreaking () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> queue.dequeue () );

        String expectedMessage = "Queue Underflow";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testPeek () {
        setData ();

        Assertions.assertEquals ( 1, queue.peek () );
    }

    @Test
    public void testPeekBreaking () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> queue.peek () );

        String expectedMessage = "Queue Underflow";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

}
