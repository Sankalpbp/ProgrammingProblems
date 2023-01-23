package warmUpProblems.arrays;

public class DynamicList {

    private int [] array;
    private int length;
    private int maximumSize;

    public DynamicList () {
        this.length = 0;
        this.maximumSize = 1;
        this.array = new int [ this.maximumSize ];
    }

    public DynamicList ( int maximumSize ) {
        this.maximumSize = maximumSize;
        this.array = new int [ maximumSize ];
        this.length = 0;
    }

    int getLength ( ) {
        return this.length;
    }

    int at ( int i ) throws ArrayIndexOutOfBoundsException {
        if ( i < 0 || i >= this.maximumSize ) {
            throw new ArrayIndexOutOfBoundsException ( "i: " + i + " is beyond the maximum size of the array." );
        }
        return this.array[i];
    }

    int getMaximumSize ( ) {
        return this.maximumSize;
    }

    void set ( int i, int value ) throws ArrayIndexOutOfBoundsException {
        if ( i < 0 || i >= this.maximumSize ) {
            throw new ArrayIndexOutOfBoundsException ( "i: " + i + " is beyond the maximum size of the array." );
        }

        this.array [i] = value;
    }

    void resize ( ) {
        int [] newArray = new int [ this.maximumSize * 2 ];

        for ( int i = 0; i < this.maximumSize; ++i ) {
            newArray [i] = this.array [i];
        }

        this.array = newArray;
    }

    void add ( int value ) {
        if ( this.length >= this.maximumSize ) {
            this.resize ( );
        }

        this.array [ length ] = value;
        ++this.length;
    }

    void add ( int i, int value ) {
        if ( this.length > this.maximumSize ) {
            this.resize ();
        }

        for ( int k = i + 1; k < this.length; ++k ) {
            this.array [ k ] = this.array [ k - 1 ];
        }
    }

    void remove ( int i ) {
        if ( i < 0 || i >= this.maximumSize ) {
            throw new ArrayIndexOutOfBoundsException ( "i: " + i + " is beyond the maximum size of the array." );
        }

        for ( int k = i + 1; k < this.length; ++k ) {
            this.array [ k - 1 ] = this.array [ k ];
        }
    }

    void remove ( ) {
        if ( this.length <= 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "There are no elements in the array to remove." );
        }

        --this.length;
    }

    public int first ( ) {
        if ( this.length <= 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "There are no elements in the array." );
        }

        return this.array [ 0 ];
    }

    public int last ( ) {
        if ( this.length <= 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "There are no elements in the array" );
        }

        return this.array [ this.length - 1 ];
    }

    @Override
    public String toString ( ) {
        StringBuilder arrayAsString = new StringBuilder();
        arrayAsString.append ( "[ " );

        for ( int i = 0; i < this.length - 1; ++i ) {
            arrayAsString.append ( this.array[i] ).append ( ", " );
        }

        if ( this.length > 0 ) {
            arrayAsString.append ( this.array [ this.length - 1 ] );
        }

        arrayAsString.append ( " ]" );

        return arrayAsString.toString ();
    }

}
