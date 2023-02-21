package warmUpProblems.sorting;

public class AdvancedSortingTechniques extends SortingTechniques {

    public AdvancedSortingTechniques () {
        super ();
    }

    public AdvancedSortingTechniques ( int [] array ) {
        super ( array );
    }

    public void mergeSort () {
        mergeSort ( super.getArray (), 0, super.getSize() - 1 );
    }

    public void quickSort () {
        quickSort ( super.getArray (), 0, super.getSize () - 1 );
    }

    private void mergeSort ( int [] array, int start, int end ) {
        if ( start >= end ) {
            return;
        }

        int mid = start + ( end - start ) / 2;

        mergeSort ( array, start, mid );
        mergeSort ( array, mid + 1, end );

        merge ( array, start, mid, end );
    }

    public void countingSort ( ) {
        countingSort ( super.getArray () );
    }

    public void radixSort ( ) {
        radixSort ( super.getArray (), super.getSize () );
    }

    private void radixSort ( int [] array, int size ) {

        int maximumElement = getMaximumElement ( array );

        for ( int place = 1; ( maximumElement / place ) > 0; place *= 10 ) {
            countingSortForRadix ( array, place );
        }
    }

    private void countingSortForRadix ( int [] array, int place ) {
        int [] count = new int [ 10 ];

        for ( int x : array ) {
            ++count [ ( x / place ) % 10 ];
        }

        for ( int i = 1; i < count.length; ++i ) {
            count [ i ] += count [ i - 1 ];
        }

        int [ ] dummy = new int [ array.length ];

        for ( int i = array.length - 1; i >= 0; --i ) {
            dummy [ count [ ( array [ i ] / place ) % 10 ] - 1 ] = array [ i ];
            --count [ ( array [ i ] / place ) % 10 ];
        }

        System.arraycopy ( dummy, 0, array, 0, array.length );
    }

    private int getMaximumElement ( int [] array ) {
        int maximumElement = Integer.MIN_VALUE;

        for (int j : array) {
            if (maximumElement < j) {
                maximumElement = j;
            }
        }

        return maximumElement;
    }

    private void countingSort ( int [] array ) {

        int maximumElement = getMaximumElement ( array );

        int [ ] count = new int [ maximumElement + 1 ];

        for ( int x : array ) {
            ++count [ x ];
        }

        for ( int i = 1; i <= maximumElement; ++i ) {
            count [ i ] += count [ i - 1 ];
        }

        int [ ] dummy = new int [ array.length ];

        for ( int x : array ) {
            dummy [ count [ x ] - 1] = x;
            --count [ x ];
        }

        System.arraycopy ( dummy, 0, array, 0, array.length );
    }

    private void merge ( int [] array, int start, int mid, int end ) {

        int leftArraySize = mid - start + 1;
        int rightArraySize = end - mid;

        int [] leftArray = new int [ leftArraySize + 1 ];
        int [] rightArray = new int [ rightArraySize + 1 ];

        System.arraycopy ( array, start, leftArray, 0, mid - start + 1 );
        System.arraycopy ( array, mid + 1, rightArray, 0, end - mid );

        leftArray [ leftArraySize ] = Integer.MAX_VALUE;
        rightArray [ rightArraySize ] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for ( int k = start; k <= end; ++k ) {
            if ( leftArray [ i ] < rightArray [ j ] ) {
                array [ k ] = leftArray [ i ];
                ++i;
            } else {
                array [ k ] = rightArray [ j ];
                ++j;
            }
        }
    }

    private void quickSort ( int [] array, int start, int end ) {
        if ( start >= end ) {
            return;
        }

        if ( end == start + 1 ) {
            if ( array [ end ] > array [ start ] ) {
                int temp = array [ start ];
                array [ start ] = array [ end ];
                array [ end ] = temp;
            }
        }

        int pivotIndex = quick ( array, start, end );

        quickSort ( array, start, pivotIndex - 1 );
        quickSort ( array, pivotIndex + 1, end );
    }

    private int quick ( int [] array, int start, int end ) {
        int i = start - 1;

        int pivot = array [ end ];

        for ( int j = start; j <= end - 1; ++j ) {
            if ( array [ j ] < pivot ) {
                ++i;
                int temp = array [ j ];
                array [ j ] = array [ i ];
                array [ i ] = temp;
            }
        }

        array [ end ] = array [ i + 1 ];
        array [ i + 1 ] = pivot;

        return i + 1;
    }

}
