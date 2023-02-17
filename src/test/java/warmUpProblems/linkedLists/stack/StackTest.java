package warmUpProblems.linkedLists.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.BasicTest;

public class StackTest implements BasicTest {

    private Stack stack;

    @Override
    @BeforeEach
    public void testSetup() {
        stack = new Stack ();
    }

    public void setData () {
        stack.push ( 1 );
        stack.push ( 2 );
        stack.push ( 3 );
    }

    @Test
    public void testPush () {
        stack.push ( 1 );
        stack.push ( 2 );
        stack.push ( 3 );

        Assertions.assertEquals ( "[ 3, 2, 1 ]", stack.toString () );
    }

    @Test
    public void testToStringWithOneElement ( ) {
        stack.push ( 1 );

        Assertions.assertEquals ( "[ 1 ]", stack.toString () );
    }

    @Test
    public void testToStringWithZeroElements () {
        stack.push ( 1 );
        stack.pop ();

        Assertions.assertEquals ( "[  ]", stack.toString () );
    }

    @Test
    public void testPop () {
        setData ();

        stack.pop ();
        Assertions.assertEquals ( "[ 2, 1 ]", stack.toString () );
    }

    @Test
    public void testPopBreaking () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> stack.pop () );

        String expectedMessage = "Stack Underflow";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testTop () {
        setData ();

        Assertions.assertEquals ( 3, stack.top () );
    }

    @Test
    public void testTopBreaking () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> stack.top () );

        String expectedMessage = "Stack Underflow";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }
}

