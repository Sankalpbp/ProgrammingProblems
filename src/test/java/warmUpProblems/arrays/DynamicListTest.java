package warmUpProblems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.BasicTest;

public class DynamicListTest implements BasicTest {

    private DynamicList list;

    @BeforeEach
    public void testSetup ( ) {
        list = new DynamicList ();
    }

    @Test
    public void toStringNullTest ( ) {
        String arrayAsString = "[  ]";
        Assertions.assertEquals( list.toString(), arrayAsString );
    }

    @Test
    public void toStringSingleElementTest ( ) {
        list.add ( 1 );
        String arrayAsString = "[ 1 ]";
        Assertions.assertEquals( list.toString (), arrayAsString );
    }

    @Test
    public void toStringTest () {
        list.add ( 1 );
        list.add ( 2 );
        String arrayAsString = "[ 1, 2 ]";
        Assertions.assertEquals ( list.toString(), arrayAsString );
    }

    @Test
    public void testArgsConstructor ( ) {
        list = new DynamicList ( 3 );
        setData ();

        String arrayAsString = "[ 1, 2, 3 ]";
        Assertions.assertEquals ( list.toString (), arrayAsString );
    }

    @Test
    public void testGetLength () {
        setData ();
        Assertions.assertEquals ( list.getLength (), 3 );
    }

    @Test
    public void testGetMaximumSize () {
        setData ();

        Assertions.assertEquals ( list.getMaximumSize (), 4 );
    }

    @Test
    public void testAt ( ) {
        setData ();
        Assertions.assertEquals ( list.at ( 1 ), 2 );
    }

    @Test
    public void testAtBreaking ( ) {
        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> {
            setData ();
            list.add (10, 10 );
            list.at ( 33 );
        });
        String expectedMessage = "i: " + 33 + " is beyond the maximum size of the array.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testSet ( ) {
        setData ();
        list.set ( 2, 99 );
        Assertions.assertEquals ( list.at ( 2 ), 99 );
    }

    @Test
    public void testSetBreaking () {
        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> {
            setData ();
            list.set ( 99, 100 );
        });

        String expectedMessage = "i: " + 99 + " is beyond the maximum size of the array.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testFirst ( ) {
        setData ();
        Assertions.assertEquals ( list.first (), 1 );
    }

    @Test
    public void testFirstBreaking () {
        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> list.first ());

        String expectedMessage = "There are no elements in the array.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testLast ( ) {
        setData ( );
        Assertions.assertEquals ( list.last (), 3 );
    }

    @Test
    public void testLastBreaking ( ) {
        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> list.last () );

        String expectedMessage = "There are no elements in the array.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testRemove ( ) {
        setData ();
        list.remove ( );

        Assertions.assertEquals ( list.toString (), "[ 1, 2 ]" );
    }

    @Test
    public void testRemoveBreaking () {
        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> list.remove () );

        String expectedMessage = "There are no elements in the array to remove.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testRemoveWithArgument () {
        setData ();
        list.remove ( 1 );

        Assertions.assertEquals ( "[ 1, 3 ]", list.toString () );
    }

    @Test
    public void testRemoveWithArgumentBreaking () {
        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> {
            setData ();
            list.remove ( 99 );
        });

        String expectedMessage = "i: " + 99 + " is beyond the maximum size of the array.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    @Test
    public void testAddWithIndex ( ) {
        setData ();
        setData ();
        list.add ( 3, 99 );

        Assertions.assertEquals(99, list.at(3));
    }

    @Test
    public void testAddWithIndexBreaking () {

        Exception exception = Assertions.assertThrows ( ArrayIndexOutOfBoundsException.class, () -> list.add ( -1, 99 ) );

        String expectedMessage = "Invalid Index: -1";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

    private void setData ( ) {
        list.add ( 1 );
        list.add ( 2 );
        list.add ( 2, 3 );
    }

}
