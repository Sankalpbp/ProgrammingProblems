package warmUpProblems.searching;

import warmUpProblems.Techniques;

public class SearchingTechniques extends Techniques {

    public SearchingTechniques ( ) {
        super ( );
    }

    public SearchingTechniques ( int [ ] array ) {
        super ( array );
    }

    /**
     * @param element: the element to search in the array
     * @return the index of element and -1 if not found
     */
    public int linearSearch ( int element ) {
        for ( int i = 0; i < super.getSize ( ); ++i ) {
            if ( super.get ( i ) == element ) {
                return i;
            }
        }

        return -1;
    }

    /**
     * @param element: the element to search in the array
     * @return the index of element and -1 if not found
     */
    public int binarySearch ( int element ) {
        return binarySearch ( super.getArray (), 0, super.getSize () - 1, element );
    }

    private int binarySearch ( int [ ] array, int start, int end, int element ) {
        if ( start > end ) {
            return -1;
        }

        if ( start == end && array [ start ] == element ) {
            return start;
        }

        int mid = start + ( end - start ) / 2;

        if ( array [ mid ] > element ) {
            return binarySearch ( array, start, mid - 1, element );
        } else if ( array [ mid ] < element ) {
            return binarySearch ( array, mid + 1, end, element );
        }

        return ( array [ mid ] == element ) ? mid : -1;
    }
}
