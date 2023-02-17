package warmUpProblems.arrays.queue;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Queue {

    private final ArrayList<Integer> queue;

    public Queue () {
        queue = new ArrayList<> ();
    }

    public void enqueue ( int value ) {
        queue.add ( value );
    }

    public int dequeue ( ) throws NullPointerException {
        if ( queue.isEmpty() ) {
            throw new NullPointerException ( "Queue Underflow" );
        }
        return queue.remove ( 0 );
    }

    public int peek () {
        if ( queue.isEmpty () ) {
            throw new NullPointerException ( "Queue Underflow" );
        }
        return queue.remove ( 0 );
    }

    public String toString () {
        StringBuilder builder = new StringBuilder ();

        builder.append ( "[ " );

        for ( int i = 0 ; i < queue.size () - 1 ; ++i ) {
            builder.append ( queue.get ( i ) );
            builder.append ( ", " );
        }

        if ( queue.size () != 0 ) {
            builder.append ( queue.get ( queue.size () - 1 ) );
        }

        builder.append ( " ]" );

        return builder.toString ();
    }
}
