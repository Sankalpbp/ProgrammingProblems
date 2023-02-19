package warmUpProblems;

import warmUpProblems.sorting.AdvancedSortingTechniques;
import warmUpProblems.sorting.SimpleSortingTechniques;
import warmUpProblems.sorting.SortingTechniques;

import java.util.Arrays;

/**
 * Class to provide utility methods for creating arrays for test cases of Sorting techniques
 */
public class ArrayTestUtil {

    private static boolean isSimpleSortingTechnique ( SortingTechniques technique ) {
        return technique instanceof SimpleSortingTechniques;
    }

    public static SortingTechniques setSingleElementArray ( SortingTechniques technique ) {
        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ();
        }

        return new AdvancedSortingTechniques ();
    }

    public static SortingTechniques setEqualElementsArray ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        Arrays.fill (array, 1 );
        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }

    public static SortingTechniques setSortedElementsArray ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        for ( int i = 0; i < array.length; ++i ) {
            array[i] = i + 1;
        }

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }

    public static SortingTechniques setReversedSortedArray ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        for ( int i = 0; i < array.length; ++i ) {
            array[ i ] = array.length - i;
        }

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }

    public static SortingTechniques setNormalArray ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        array[ 0 ] = 6;
        array[ 1 ] = 5;
        array[ 2 ] = 3;
        array[ 3 ] = 2;
        array[ 4 ] = 1;
        array[ 5 ] = 4;

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }

    public static SortingTechniques setArrayWithDuplicates ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        array[ 0 ] = 2;
        array[ 1 ] = 1;
        array[ 2 ] = 3;
        array[ 3 ] = 3;
        array[ 4 ] = 2;
        array[ 5 ] = 1;

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }

    public static SortingTechniques setNegativeElementsArray ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        array [ 0 ] = -1;
        array [ 1 ] = -3;
        array [ 2 ] = -2;
        array [ 3 ] = -6;
        array [ 4 ] = -5;
        array [ 5 ] = -4;

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }

    public static SortingTechniques setMixedNegativePositiveArray ( SortingTechniques technique ) {
        int [] array = new int [ 6 ];
        array [ 0 ] = 1;
        array [ 1 ] = -1;
        array [ 2 ] = -999;
        array [ 3 ] = 0;
        array [ 4 ] = 134;
        array [ 5 ] = 6;

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }
}
