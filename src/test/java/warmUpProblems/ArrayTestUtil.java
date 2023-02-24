package warmUpProblems;

import warmUpProblems.searching.SearchingTechniques;
import warmUpProblems.sorting.AdvancedSortingTechniques;
import warmUpProblems.sorting.SimpleSortingTechniques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public static final Map<ArrayInputType, SortOutput> sortedForUnsorted = getSortedForUnsorted ();

    private static Map<ArrayInputType, SortOutput> getSortedForUnsorted ( ) {
        Map<ArrayInputType, SortOutput> sortedForUnsorted = new HashMap<> ();

        sortedForUnsorted.put ( ArrayInputType.SINGLE_ELEMENT, SortOutput.SORTED_SINGLE_ELEMENT_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.NORMAL_ARRAY, SortOutput.SORTED_NORMAL_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.EQUAL_ELEMENT, SortOutput.SORTED_EQUAL_ELEMENTS_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.ALREADY_SORTED, SortOutput.SORTED_NORMAL_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.REVERSE_SORTED, SortOutput.SORTED_NORMAL_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.WITH_DUPLICATES, SortOutput.SORTED_ARRAY_WITH_DUPLICATES );
        sortedForUnsorted.put ( ArrayInputType.NEGATIVE_ARRAY, SortOutput.SORTED_NEGATIVE_ELEMENTS_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.MIXED_ARRAY, SortOutput.SORTED_MIXED_ELEMENTS_ARRAY );
        sortedForUnsorted.put ( ArrayInputType.SPECIAL_ARRAY, SortOutput.SORTED_SPECIAL_ARRAY );

        return sortedForUnsorted;
    }


    private static boolean isSimpleSortingTechnique ( Techniques technique ) {
        return ( technique instanceof SimpleSortingTechniques );
    }

    private static boolean isSearchingTechnique ( Techniques technique ) {
        return ( technique instanceof SearchingTechniques );
    }

    public static Techniques setSingleElementArray ( Techniques technique ) {
        return getTechniques ( technique );
    }

    public static Techniques setEqualElementsArray ( Techniques technique ) {
        int [] array = new int [ 6 ];
        Arrays.fill (array, 1 );

        return getTechniques(technique, array);
    }

    private static Techniques getTechniques ( Techniques technique ) {
        if ( isSearchingTechnique ( technique ) ) {
            return new SearchingTechniques();
        }

        if ( isSimpleSortingTechnique (technique) ) {
            return new SimpleSortingTechniques();
        }

        return new AdvancedSortingTechniques();
    }

    private static Techniques getTechniques ( Techniques technique, int [ ] array ) {
        if ( isSearchingTechnique (technique) ) {
            return new SearchingTechniques(array);
        }

        if ( isSimpleSortingTechnique (technique) ) {
            return new SimpleSortingTechniques(array);
        }

        return new AdvancedSortingTechniques(array);
    }

    public static Techniques setSortedElementsArray ( Techniques technique ) {
        int [] array = new int [ 6 ];
        for ( int i = 0; i < array.length; ++i ) {
            array[i] = i + 1;
        }

        return getTechniques ( technique, array );
    }

    public static Techniques setReversedSortedArray ( Techniques technique ) {
        int [] array = new int [ 6 ];
        for ( int i = 0; i < array.length; ++i ) {
            array[ i ] = array.length - i;
        }

        return getTechniques ( technique, array );
    }

    public static Techniques setNormalArray ( Techniques technique ) {
        int [] array = new int [ 6 ];
        array[ 0 ] = 6;
        array[ 1 ] = 5;
        array[ 2 ] = 3;
        array[ 3 ] = 2;
        array[ 4 ] = 1;
        array[ 5 ] = 4;

        return getTechniques ( technique, array );
    }

    public static Techniques setArrayWithDuplicates ( Techniques technique ) {
        int [] array = new int [ 6 ];
        array[ 0 ] = 2;
        array[ 1 ] = 1;
        array[ 2 ] = 3;
        array[ 3 ] = 3;
        array[ 4 ] = 2;
        array[ 5 ] = 1;

        return getTechniques ( technique, array );
    }

    public static Techniques setNegativeElementsArray ( Techniques technique ) {
        int [] array = new int [ 6 ];
        array [ 0 ] = -1;
        array [ 1 ] = -3;
        array [ 2 ] = -2;
        array [ 3 ] = -6;
        array [ 4 ] = -5;
        array [ 5 ] = -4;

        return getTechniques ( technique, array );
    }

    public static Techniques setMixedNegativePositiveArray ( Techniques technique ) {
        int [] array = new int [ 6 ];
        array [ 0 ] = 1;
        array [ 1 ] = -1;
        array [ 2 ] = -999;
        array [ 3 ] = 0;
        array [ 4 ] = 134;
        array [ 5 ] = 6;

        return getTechniques ( technique, array );
    }

    public static Techniques setSpecialArray ( Techniques technique ) {
        int [ ] array = new int [ 6 ];
        array [ 0 ] = 923;
        array [ 1 ] = 194;
        array [ 2 ] = 37;
        array [ 3 ] = 2;
        array [ 4 ] = 461;
        array [ 5 ] = 73;

        return getTechniques ( technique, array );
    }
}
