package warmUpProblems.arrays.stack;

import java.util.ArrayList;

public class Stack {

    private final ArrayList<Integer> array;

    public Stack () {
        array = new ArrayList<>();
    }

    public void push ( int value ) {
        array.add ( value );
    }

    public int pop ( ) throws NullPointerException {
        if ( array.isEmpty() ) {
            throw new NullPointerException ( "Stack Underflow" );
        }
        return array.remove ( array.size() - 1 );
    }

    public int top () throws NullPointerException {
        if ( array.isEmpty () ) {
            throw new NullPointerException ( "Stack Underflow" );
        }
        return array.get ( array.size () - 1 );
    }

    public String toString () {
        StringBuilder builder = new StringBuilder ();

        builder.append ( "[ " );

        for ( int i = 0 ; i < array.size () - 1 ; ++i ) {
            builder.append ( array.get ( i ) );
            builder.append ( ", " );
        }

        if ( array.size () != 0 ) {
            builder.append ( array.get ( array.size () - 1 ) );
        }

        builder.append ( " ]" );

        return builder.toString ();
    }
}
