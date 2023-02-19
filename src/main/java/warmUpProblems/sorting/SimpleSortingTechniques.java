package warmUpProblems.sorting;

public class SimpleSortingTechniques extends SortingTechniques {

    private int [] array;
    private int size;

    public SimpleSortingTechniques ( ) {
        this.size = 1;
        this.array = new int [ size ];
        this.array[ 0 ] = 1;
    }

    public SimpleSortingTechniques ( int [] array ) {
        this.size = array.length;
        this.array = new int [ this.size ];
        System.arraycopy ( array, 0, this.array, 0, this.size );
    }

    public void bubbleSort ( ) {
        for ( int i = 0; i < size - 1; ++i ) {
            for ( int j = size - 1; j >= 1; --j ) {
                if ( array[ j ] < array [ j - 1 ] ) {
                    int temp = array[ j ];
                    array[ j ] = array[ j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public void selectionSort () {
        for ( int i = 0; i < size - 1; ++i ) {
            int indexOfMinimumElement = -1;
            int minimumElement = Integer.MAX_VALUE;
            for ( int j = i; j < size; ++j ) {
                if ( minimumElement > array [ j ] ) {
                    minimumElement = array [ j ];
                    indexOfMinimumElement = j;
                }
            }

            int temp = array [ i ] ;
            array [ i ] = array [ indexOfMinimumElement ];
            array [ indexOfMinimumElement ] = temp;
        }
    }

    public void insertionSort () {

        for ( int i = 1 ; i < size; ++i ) {
            int savedElement = array [ i ];
            int j = i - 1;

            while ( j >= 0 && array [ j ] > savedElement ) {
                array [ j + 1] = array [ j ];
                --j;
            }

            array [ j + 1 ] = savedElement;
        }

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
