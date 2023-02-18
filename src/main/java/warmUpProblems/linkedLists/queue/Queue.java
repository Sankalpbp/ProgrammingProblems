package warmUpProblems.linkedLists.queue;

import java.util.LinkedList;

public class Queue {

    private final LinkedList<Integer> queue;

    public Queue ( ) {
        queue = new LinkedList<> ();
    }

    public void enqueue ( int value ) {
        queue.add ( value );
    }

    public int dequeue ( ) throws NullPointerException {
        if ( queue.isEmpty () ) {
            throw new NullPointerException ( "Queue Underflow" );
        }

        return queue.pop (); // same as calling removeFirst ()
    }

    public int peek ( ) throws NullPointerException {
        if ( queue.isEmpty () ) {
            throw new NullPointerException ( "Queue Underflow" );
        }

        return queue.getFirst ();
    }

    public String toString ( ) {
        StringBuilder builder = new StringBuilder ();

        builder.append ( "[ " );

        for ( int i = 0; i < queue.size () - 1; ++i ) {
            builder.append ( queue.get ( i ) );
            builder.append ( ", " );
        }

        if ( !queue.isEmpty () ) {
            builder.append ( queue.get ( queue.size () - 1 ) );
        }
        builder.append ( " ]" );

        return builder.toString ();
    }

}
