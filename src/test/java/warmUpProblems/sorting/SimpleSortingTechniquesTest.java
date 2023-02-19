package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.BasicTest;

import java.util.Arrays;

public class SimpleSortingTechniquesTest implements BasicTest  {

    private SimpleSortingTechniques technique;
    private static final String SORTED_NORMAL_ARRAY = "[ 1, 2, 3, 4, 5, 6 ]";
    private static final String SORTED_EQUAL_ELEMENTS_ARRAY = "[ 1, 1, 1, 1, 1, 1 ]";
    private static final String SORTED_SINGLE_ELEMENT_ARRAY = "[ 1 ]";
    private static final String SORTED_ARRAY_WITH_DUPLICATES = "[ 1, 1, 2, 2, 3, 3 ]";
    private static final String SORTED_NEGATIVE_ELEMENTS_ARRAY = "[ -6, -5, -4, -3, -2, -1 ]";
    private static final String SORTED_MIXED_ELEMENTS_ARRAY = "[ -999, -1, 0, 1, 6, 134 ]";

    @Override
    @BeforeEach
    public void testSetup () {
    }

    private void setSingleElementArray () {
        technique = new SimpleSortingTechniques ( );
    }

    private void setEqualElementsArray () {
        int [] array = new int [6];
        Arrays.fill(array, 1);
        technique = new SimpleSortingTechniques ( array );
    }

    private void setSortedElementsArray() {
        int [] array = new int [ 6 ];
        for ( int i = 0; i < array.length; ++i ) {
            array[i] = i + 1;
        }

        technique = new SimpleSortingTechniques ( array );
    }

    private void setReversedSortedArray () {
        int [] array = new int [ 6 ];
        for ( int i = 0; i < array.length; ++i ) {
            array[ i ] = array.length - i;
        }

        technique = new SimpleSortingTechniques ( array );
    }

    public void setNormalArray () {
        int [] array = new int [ 6 ];
        array[ 0 ] = 6;
        array[ 1 ] = 5;
        array[ 2 ] = 3;
        array[ 3 ] = 2;
        array[ 4 ] = 1;
        array[ 5 ] = 4;

        technique = new SimpleSortingTechniques ( array );
    }

    public void setArrayWithDuplicates () {
        int [] array = new int [ 6 ];
        array[ 0 ] = 2;
        array[ 1 ] = 1;
        array[ 2 ] = 3;
        array[ 3 ] = 3;
        array[ 4 ] = 2;
        array[ 5 ] = 1;

        technique = new SimpleSortingTechniques ( array );
    }

    public void setNegativeElementsArray () {
        int [] array = new int [ 6 ];
        array [ 0 ] = -1;
        array [ 1 ] = -3;
        array [ 2 ] = -2;
        array [ 3 ] = -6;
        array [ 4 ] = -5;
        array [ 5 ] = -4;

        technique = new SimpleSortingTechniques ( array );
    }

    public void setMixedNegativePositiveArray () {
        int [] array = new int [ 6 ];
        array [ 0 ] = 1;
        array [ 1 ] = -1;
        array [ 2 ] = -999;
        array [ 3 ] = 0;
        array [ 4 ] = 134;
        array [ 5 ] = 6;

        technique = new SimpleSortingTechniques ( array );
    }

    @Test
    public void testBubbleSortWithSingleElementArray ( ) {
        setSingleElementArray ();
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithEqualElementsArray () {
        setEqualElementsArray();
        technique.bubbleSort();

        Assertions.assertEquals ( SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray () {
        setSortedElementsArray ();
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithReverseSortedArray () {
        setReversedSortedArray ();
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithDuplicatesInsideArray () {
        setArrayWithDuplicates();
        technique.bubbleSort();

        Assertions.assertEquals ( SORTED_ARRAY_WITH_DUPLICATES, technique.toString () );
    }

    @Test
    public void testBubbleSort () {
        setNormalArray ();
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void NestBubbleSortWithNegativeNumbersArray () {
        setNegativeElementsArray ();
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testMixedNegativePositive () {
        setMixedNegativePositiveArray ();
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSort () {
        setNormalArray ();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithReverseOrderElements () {
        setReversedSortedArray ();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithSingleElementArray () {
        setSingleElementArray();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithDuplicates () {
        setArrayWithDuplicates();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_ARRAY_WITH_DUPLICATES, technique.toString ( ) );
    }

    @Test
    public void testSelectionSortWithAlreadySortedArray () {
        setSortedElementsArray();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public  void testSelectionSortWithEqualElementsArray () {
        setEqualElementsArray();
        technique.selectionSort ();
        Assertions.assertEquals ( SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithNegativeElementsArray () {
        setNegativeElementsArray ();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithMixedElementsArray () {
        setMixedNegativePositiveArray ();
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSort () {
        setNormalArray ();
        technique.insertionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }



}
