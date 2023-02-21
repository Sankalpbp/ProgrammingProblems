package warmUpProblems.sorting;

/**
 * An abstract class extended by classes implementing various sorting techniques
 */
public abstract class SortingTechniques {

    private int [] array;
    private int size;

    public SortingTechniques ( ) {
        this.size = 1;
        this.array = new int [ size ];
        this.array[ 0 ] = 1;
    }

    public SortingTechniques ( int [] array ) {
        this.size = array.length;
        this.array = new int [ this.size ];
        System.arraycopy ( array, 0, this.array, 0, this.size );
    }

    public int get ( int i ) {
        return this.array [ i ];
    }

    public void set ( int i, int value ) {
        this.array [ i ] = value;
    }

    public int [] getArray () {
        return this.array;
    }

    public int getSize ( ) {
        return this.size;
    }

    @Override
    public String toString ( ) {
        StringBuilder builder = new StringBuilder ( );

        builder.append ( "[ " );

        for ( int i = 0; i < size; ++i ) {
            builder.append ( array[ i ] );
            builder.append ( ", " );
        }

        if ( size > 0 ) {
            builder.delete ( builder.length() - 2, builder.length () );
        }

        builder.append ( " ]" );
        return builder.toString ();
    }

}
