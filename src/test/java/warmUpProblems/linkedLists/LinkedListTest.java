package warmUpProblems.linkedLists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.BasicTest;

public class LinkedListTest implements BasicTest {

    private LinkedList list;

    public static final String INVALID_POSITION_ERROR_MESSAGE_PREFIX = "i: ";
    public static final String INVALID_POSITION_ERROR_MESSAGE_POSTFIX = " is not a valid position for this LinkedList object.";

    @Override
    @BeforeEach
    public void testSetup() {
        list = new LinkedList ();
    }

    private void setData ( ) {
        list.add ( 1 );
        list.add ( 2 );
        list.add ( 3 );
    }

    private String getErrorMessage ( int i ) {
        return INVALID_POSITION_ERROR_MESSAGE_PREFIX + i + INVALID_POSITION_ERROR_MESSAGE_POSTFIX;
    }

    @Test
    public void testGetZeroLength () {
        Assertions.assertEquals ( 0, list.getLength () );
    }

    @Test
    public void testGetLength () {
        setData ();
        Assertions.assertEquals ( 3, list.getLength () );
    }

    @Test
    public void testAtIndexLessThanZero ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> list.at ( -1 ));

        String expectedMessage = "i: " + (-1) + " is not a valid position for this LinkedList object.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testAtIndexGreaterThanLength ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> {
            setData ();
            list.at ( 999 );
        });

        String expectedMessage = "i: " + 999 + " is not a valid position for this LinkedList object.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testAt( ) {
        setData ();
        Assertions.assertEquals ( 1, list.at ( 0 ) );
    }

    @Test
    public void testAdd () {
        list.add ( 123 );
        Assertions.assertEquals ( 123, list.at ( 0 ) );
        Assertions.assertEquals ( 1, list.getLength () );
    }

    @Test
    public void testSet () {
        setData ();
        list.set ( 1, 333 );
        Assertions.assertEquals ( 333, list.at ( 1 ) );
    }

    @Test
    public void testSetWhenIndexLessThanZero ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> {
            setData ();
            list.set ( -1, 23 );
        });

        String expectedMessage = "i: " + (-1) + " is not a valid position for this LinkedList object.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testSetWhenLengthGreaterThanLength () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> {
            setData ();
            list.set ( 999, 1 );
        });

        String expectedMessage = "i: " + 999 + " is not a valid position for this LinkedList object.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testAddWhenIndexSmallerThanZero ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> list.add ( -1, 12 ) );

        String expectedMessage = getErrorMessage ( -1 );
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testAddWhenIndexGreaterThanLength ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> list.add ( 999, 12 ) );

        String expectedMessage = getErrorMessage ( 999 );
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testAddWithIndex ( ) {
        setData ();
        list.add ( 1, 999 );

        Assertions.assertEquals ( "[ 1, 999, 2, 3 ]", list.toString () );
    }

    @Test
    public void testFirst ( ) {
        setData ();
        Assertions.assertEquals ( 1, list.first () );
    }

    @Test
    public void testLast ( ) {
        setData ();
        Assertions.assertEquals ( 3, list.last () );
    }

    @Test
    public void testFirstBreaking ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> list.first () );

        String expectedMessage = "LinkedList has 0 elements.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testLastBreaking ( ) {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> list.last () );

        String expectedMessage = "LinkedList has 0 elements.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testToStringWithZeroElements () {
        Assertions.assertEquals ( "[  ]", list.toString () );
    }

    @Test
    public void testToStringWithSingleElement () {
        list.add ( 1 );
        Assertions.assertEquals ( "[ 1 ]", list.toString () );
    }

    @Test
    public void testRemove () {
        setData ();
        list.remove ();

        Assertions.assertEquals ( "[ 1, 2 ]", list.toString () );
    }

    @Test
    public void testRemoveForEmptyList () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> list.remove () );

        String expectedMessage = "There are no elements in the LinkedList.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testRemoveWithIndex ( ) {
        setData ();
        list.remove ( 1 );

        Assertions.assertEquals ( "[ 1, 3 ]", list.toString () );
    }

    @Test
    public void testRemoveWithIndexLessThanZero () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> {
            setData ();
            list.remove ( -1 );
        });

        String expectedMessage = getErrorMessage ( -1 );
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testRemoveWithIndexGreaterThanLength () {
        Exception exception = Assertions.assertThrows ( NullPointerException.class, () -> {
            setData ();
            list.remove ( 999 );
        });

        String expectedMessage = getErrorMessage ( 999 );
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testRemoveListWithOneElement ( ) {
        list.add ( 1 );
        list.remove ();

        Assertions.assertEquals ( "[  ]", list.toString () );
    }

    @Test
    public void testRemoveWithIndexWithOneElement () {
        list.add ( 1 );
        list.remove ( 0 );

        Assertions.assertEquals ( "[  ]", list.toString() );
    }

    @Test
    public void testRemoveWithIndexRemovingLastElement () {
        setData ();
        list.remove ( );

        Assertions.assertEquals ( "[ 1, 2 ]", list.toString () );
    }

    @Test
    public void testAddWithIndexToAnEmptyList ( ) {
        list.add ( 0, 999 );

        Assertions.assertEquals ( 999, list.at ( 0 ) );
    }

}
