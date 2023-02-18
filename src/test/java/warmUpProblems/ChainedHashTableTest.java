package warmUpProblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.hashing.ChainedHashTable;

import java.util.NoSuchElementException;

public class ChainedHashTableTest implements BasicTest {

    private ChainedHashTable hashTable;

    @Override
    @BeforeEach
    public void testSetup () {
        hashTable = new ChainedHashTable ( );
    }

    public void setData () {
        hashTable.put ( 1, 2 );
        hashTable.put ( 2, 3 );
        hashTable.put ( 3, 4 );
    }

    @Test
    public void testToString ( ) {
        setData ();

        Assertions.assertEquals ( "[ { 1 -> 2 }, { 2 -> 3 }, { 3 -> 4 } ]", hashTable.toString ());
    }

    @Test
    public void testToStringWithSinglePair ( ) {
        hashTable.put ( 1, 2 );

        Assertions.assertEquals ( "[ { 1 -> 2 } ]", hashTable.toString () );
    }

    @Test
    public void testToStringWithZeroPairs () {
        Assertions.assertEquals ( "[  ]", hashTable.toString () );
    }

    @Test
    public void testSearchFound () {
        setData ();
        Assertions.assertTrue ( hashTable.search ( 1 ) );
    }

    @Test
    public void testSearchNotFound () {
        setData ();
        Assertions.assertFalse ( hashTable.search ( 99 ) );
    }

    @Test
    public void testPut () {
        setData ();
        Pair expectedPair = new Pair ( 1, 2 );
        Pair actualPair = new Pair ( 1, hashTable.get ( 1 ) );

        Assertions.assertEquals ( expectedPair, actualPair );
    }

    @Test
    public void testGetBreaking () {
        Exception exception = Assertions.assertThrows ( NoSuchElementException.class, () -> hashTable.get ( 1 ) );

        String expectedMessage = "The key: " + ( 1 ) + " is not found in the Hash Table.";
        String actualMessage = exception.getMessage ();

        Assertions.assertTrue ( actualMessage.contains ( expectedMessage ) );
    }

}
