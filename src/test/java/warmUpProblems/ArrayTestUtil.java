package warmUpProblems;

import warmUpProblems.sorting.AdvancedSortingTechniques;
import warmUpProblems.sorting.SimpleSortingTechniques;
import warmUpProblems.sorting.SortingTechniques;

import java.util.Arrays;

/**
 * Class to provide utility methods for creating arrays for test cases of Sorting techniques
 */
public class ArrayTestUtil {

    public static final String SORTED_NORMAL_ARRAY = "[ 1, 2, 3, 4, 5, 6 ]";
    public static final String SORTED_EQUAL_ELEMENTS_ARRAY = "[ 1, 1, 1, 1, 1, 1 ]";
    public static final String SORTED_SINGLE_ELEMENT_ARRAY = "[ 1 ]";
    public static final String SORTED_ARRAY_WITH_DUPLICATES = "[ 1, 1, 2, 2, 3, 3 ]";
    public static final String SORTED_NEGATIVE_ELEMENTS_ARRAY = "[ -6, -5, -4, -3, -2, -1 ]";
    public static final String SORTED_MIXED_ELEMENTS_ARRAY = "[ -999, -1, 0, 1, 6, 134 ]";
    public static final String SORTED_SPECIAL_ARRAY = "[ 2, 37, 73, 194, 461, 923 ]";

    public static final String SINGLE_ELEMENT = "array with single elements";
    public static final String EQUAL_ELEMENT = "array with equal elements";
    public static final String ALREADY_SORTED = "array with already sorted elements";
    public static final String REVERSE_SORTED = "array with reverse sorted elements";
    public static final String WITH_DUPLICATES = "array with some duplicates";
    public static final String NORMAL_ARRAY = "array with normal elements jumbled together, but all positive";
    public static final String NEGATIVE_ARRAY = "array with all negative elements";
    public static final String MIXED_ARRAY = "array with both positive, negative elements and zero";
    public static final String SPECIAL_ARRAY = "array with random big and small elements";


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

    public static SortingTechniques setSpecialArray ( SortingTechniques technique ) {
        int [ ] array = new int [ 6 ];
        array [ 0 ] = 923;
        array [ 1 ] = 194;
        array [ 2 ] = 37;
        array [ 3 ] = 2;
        array [ 4 ] = 461;
        array [ 5 ] = 73;

        if ( isSimpleSortingTechnique ( technique ) ) {
            return new SimpleSortingTechniques ( array );
        }

        return new AdvancedSortingTechniques ( array );
    }
}
