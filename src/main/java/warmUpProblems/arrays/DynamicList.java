package warmUpProblems.arrays;

import warmUpProblems.List;

public class DynamicList implements List {

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

    @Override
    public int getLength ( ) {
        return this.length;
    }

    @Override
    public int at ( int i ) throws ArrayIndexOutOfBoundsException {
        if ( i < 0 || i >= this.maximumSize ) {
            throw new ArrayIndexOutOfBoundsException ( "i: " + i + " is beyond the maximum size of the array." );
        }
        return this.array[i];
    }

    public int getMaximumSize ( ) {
        return this.maximumSize;
    }

    @Override
    public void set ( int i, int value ) throws ArrayIndexOutOfBoundsException {
        if ( i < 0 || i >= this.maximumSize ) {
            throw new ArrayIndexOutOfBoundsException ( "i: " + i + " is beyond the maximum size of the array." );
        }

        this.array [i] = value;
    }

    private void resize ( int i ) {
        this.maximumSize = i * 2;
        int [] newArray = new int [ this.maximumSize ];

        if ( this.length >= 0 ) {
            System.arraycopy ( this.array, 0, newArray, 0, this.length );
        }

        this.array = newArray;
    }

    private void resize ( ) {
        this.maximumSize *= 2;
        int [] newArray = new int [ this.maximumSize ];

        if ( this.length >= 0 ) {
            System.arraycopy ( this.array, 0, newArray, 0, this.length );
        }

        this.array = newArray;
    }

    @Override
    public void add ( int value ) {
        if ( this.length >= this.maximumSize ) {
            this.resize ( );
        }

        this.array [ length ] = value;
        ++this.length;
    }

    @Override
    public void add ( int i, int value ) throws ArrayIndexOutOfBoundsException {
        if ( i < 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "Invalid Index: " + i );
        }
        if ( i >= this.maximumSize ) {
            this.resize ( i );
        }

        if ( this.length - ( i + 1 ) >= 0 ) {
            System.arraycopy ( this.array, i + 1 - 1, this.array, i + 1, this.length - ( i + 1 ) );
        }

        this.array [ i ] = value;

        this.length = ( i > this.length ) ? ( i + 1 ) : ( this.length + 1 );
    }

    @Override
    public void remove ( int i ) throws ArrayIndexOutOfBoundsException {
        if ( i < 0 || i >= this.maximumSize ) {
            throw new ArrayIndexOutOfBoundsException ( "i: " + i + " is beyond the maximum size of the array." );
        }

        if ( this.length - ( i + 1 ) >= 0 ) {
            System.arraycopy ( this.array, i + 1, this.array, i + 1 - 1, this.length - ( i + 1 ) );
        }

        --this.length;
    }

    @Override
    public void remove ( ) {
        if ( this.length <= 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "There are no elements in the array to remove." );
        }

        --this.length;
    }

    @Override
    public int first ( ) {
        if ( this.length <= 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "There are no elements in the array." );
        }

        return this.array [ 0 ];
    }

    @Override
    public int last ( ) {
        if ( this.length <= 0 ) {
            throw new ArrayIndexOutOfBoundsException ( "There are no elements in the array." );
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
