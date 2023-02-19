package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.ArrayTestUtil;
import warmUpProblems.BasicTest;

public class SimpleSortingTechniquesTest implements BasicTest  {

    private SimpleSortingTechniques technique;
    private static final String SORTED_NORMAL_ARRAY = "[ 1, 2, 3, 4, 5, 6 ]";
    private static final String SORTED_EQUAL_ELEMENTS_ARRAY = "[ 1, 1, 1, 1, 1, 1 ]";
    private static final String SORTED_SINGLE_ELEMENT_ARRAY = "[ 1 ]";
    private static final String SORTED_ARRAY_WITH_DUPLICATES = "[ 1, 1, 2, 2, 3, 3 ]";
    private static final String SORTED_NEGATIVE_ELEMENTS_ARRAY = "[ -6, -5, -4, -3, -2, -1 ]";
    private static final String SORTED_MIXED_ELEMENTS_ARRAY = "[ -999, -1, 0, 1, 6, 134 ]";

    private static final String SINGLE_ELEMENT = "array with single elements";
    private static final String EQUAL_ELEMENT = "array with equal elements";
    private static final String ALREADY_SORTED = "array with already sorted elements";
    private static final String REVERSE_SORTED = "array with reverse sorted elements";
    private static final String WITH_DUPLICATES = "array with some duplicates";
    private static final String NORMAL_ARRAY = "array with normal elements jumbled together, but all positive";
    private static final String NEGATIVE_ARRAY = "array with all negative elements";
    private static final String MIXED_ARRAY = "array with both positive, negative elements and zero";

    @Override
    @BeforeEach
    public void testSetup () {
        technique = new SimpleSortingTechniques ();
    }

    public void setTechnique ( final String arrayType ) {

        switch ( arrayType ) {
            case SINGLE_ELEMENT -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSingleElementArray ( technique );
            case EQUAL_ELEMENT -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setEqualElementsArray ( technique );
            case ALREADY_SORTED -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSortedElementsArray ( technique );
            case REVERSE_SORTED -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setReversedSortedArray ( technique );
            case MIXED_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setMixedNegativePositiveArray ( technique );
            case NORMAL_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setNormalArray ( technique );
            case WITH_DUPLICATES -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setArrayWithDuplicates ( technique );
            case NEGATIVE_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setNegativeElementsArray ( technique );
        }

    }

    @Test
    public void testBubbleSortWithSingleElementArray ( ) {
        setTechnique ( SINGLE_ELEMENT );
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithEqualElementsArray () {
        setTechnique ( EQUAL_ELEMENT );
        technique.bubbleSort();

        Assertions.assertEquals ( SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray () {
        setTechnique ( ALREADY_SORTED );
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithReverseSortedArray () {
        setTechnique ( REVERSE_SORTED );
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithDuplicatesInsideArray () {
        setTechnique ( WITH_DUPLICATES );
        technique.bubbleSort();

        Assertions.assertEquals ( SORTED_ARRAY_WITH_DUPLICATES, technique.toString () );
    }

    @Test
    public void testBubbleSort () {
        setTechnique ( NORMAL_ARRAY );
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void NestBubbleSortWithNegativeNumbersArray () {
        setTechnique ( NEGATIVE_ARRAY );
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testMixedNegativePositive () {
        setTechnique ( MIXED_ARRAY );
        technique.bubbleSort ();

        Assertions.assertEquals ( SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSort () {
        setTechnique ( NORMAL_ARRAY );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithReverseOrderElements () {
        setTechnique ( REVERSE_SORTED );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithSingleElementArray () {
        setTechnique ( SINGLE_ELEMENT );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithDuplicates () {
        setTechnique ( WITH_DUPLICATES );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_ARRAY_WITH_DUPLICATES, technique.toString ( ) );
    }

    @Test
    public void testSelectionSortWithAlreadySortedArray () {
        setTechnique ( ALREADY_SORTED );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public  void testSelectionSortWithEqualElementsArray () {
        setTechnique ( EQUAL_ELEMENT );
        technique.selectionSort ();
        Assertions.assertEquals ( SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithNegativeElementsArray () {
        setTechnique ( NEGATIVE_ARRAY );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithMixedElementsArray () {
        setTechnique ( MIXED_ARRAY );
        technique.selectionSort ();

        Assertions.assertEquals ( SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSort () {
        setTechnique ( NORMAL_ARRAY );
        technique.insertionSort ();

        Assertions.assertEquals ( SORTED_NORMAL_ARRAY, technique.toString () );
    }

}
