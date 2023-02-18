package warmUpProblems.linkedLists.stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack {

    private final LinkedList<Integer> stack;

    public Stack ( ) {
        stack = new LinkedList<> ();
    }

    public void push ( int value ) {
        stack.push ( value );
    }

    public int pop ( ) throws NullPointerException, NoSuchElementException {
        if ( stack.isEmpty () ) {
            throw new NullPointerException ( "Stack Underflow" );
        }

        return stack.removeFirst ( );
    }

    public int top ( ) throws NullPointerException, NoSuchElementException {
        if ( stack.isEmpty () ) {
            throw new NullPointerException ( "Stack Underflow" );
        }

        return stack.getFirst ();
    }

    public String toString ( ) {
        StringBuilder builder = new StringBuilder ();

        builder.append ( "[ " );

        for ( int i = 0; i < stack.size () - 1; ++i ) {
            builder.append ( stack.get ( i ) );
            builder.append ( ", " );
        }

        if ( !stack.isEmpty() ) {
            builder.append(stack.get(stack.size() - 1));
        }

        builder.append ( " ]" );

        return builder.toString ();
    }

}
