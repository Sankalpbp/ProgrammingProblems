package warmUpProblems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynamicListTest {

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
        list.add( 1 );
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
        list.add ( 1 );
        list.add ( 2 );
        list.add ( 3 );

        String arrayAsString = "[ 1, 2, 3 ]";
        Assertions.assertEquals ( list.toString (), arrayAsString );
    }

    @Test
    public void testGetLength () {
        list.add ( 1 );
        list.add ( 2 );
        list.add ( 4 );
        Assertions.assertEquals ( list.getLength (), 3 );
    }

    @Test
    public void testGetMaximumSize () {
        list.add ( 1 );
        list.add ( 2 );
        list.add ( 3 );

        Assertions.assertEquals ( list.getMaximumSize (), 4 );
    }



}
