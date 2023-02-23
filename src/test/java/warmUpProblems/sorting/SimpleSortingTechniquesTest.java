package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.ArrayTestUtil;
import warmUpProblems.BasicTest;

public class SimpleSortingTechniquesTest implements BasicTest  {

    private SimpleSortingTechniques technique;

    @Override
    @BeforeEach
    public void testSetup () {
        technique = new SimpleSortingTechniques ();
    }

    private void setTechnique ( final String arrayType ) {
        switch ( arrayType ) {
            case ArrayTestUtil.SINGLE_ELEMENT -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSingleElementArray ( technique );
            case ArrayTestUtil.EQUAL_ELEMENT -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setEqualElementsArray ( technique );
            case ArrayTestUtil.ALREADY_SORTED -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSortedElementsArray ( technique );
            case ArrayTestUtil.REVERSE_SORTED -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setReversedSortedArray ( technique );
            case ArrayTestUtil.MIXED_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setMixedNegativePositiveArray ( technique );
            case ArrayTestUtil.NORMAL_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setNormalArray ( technique );
            case ArrayTestUtil.WITH_DUPLICATES -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setArrayWithDuplicates ( technique );
            case ArrayTestUtil.NEGATIVE_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setNegativeElementsArray ( technique );
        }

    }

    @Test
    public void testBubbleSortWithSingleElementArray ( ) {
        setTechnique ( ArrayTestUtil.SINGLE_ELEMENT );
        technique.bubbleSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithEqualElementsArray () {
        setTechnique ( ArrayTestUtil.EQUAL_ELEMENT );
        technique.bubbleSort();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray () {
        setTechnique ( ArrayTestUtil.ALREADY_SORTED );
        technique.bubbleSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithReverseSortedArray () {
        setTechnique ( ArrayTestUtil.REVERSE_SORTED );
        technique.bubbleSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithDuplicatesInsideArray () {
        setTechnique ( ArrayTestUtil.WITH_DUPLICATES );
        technique.bubbleSort();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_ARRAY_WITH_DUPLICATES, technique.toString () );
    }

    @Test
    public void testBubbleSort () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );
        technique.bubbleSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void NestBubbleSortWithNegativeNumbersArray () {
        setTechnique ( ArrayTestUtil.NEGATIVE_ARRAY );
        technique.bubbleSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testBubbleSortWithMixedNegativePositive () {
        setTechnique ( ArrayTestUtil.MIXED_ARRAY );
        technique.bubbleSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSort () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithReverseOrderElements () {
        setTechnique ( ArrayTestUtil.REVERSE_SORTED );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithSingleElementArray () {
        setTechnique ( ArrayTestUtil.SINGLE_ELEMENT );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithDuplicates () {
        setTechnique ( ArrayTestUtil.WITH_DUPLICATES );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_ARRAY_WITH_DUPLICATES, technique.toString ( ) );
    }

    @Test
    public void testSelectionSortWithAlreadySortedArray () {
        setTechnique ( ArrayTestUtil.ALREADY_SORTED );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public  void testSelectionSortWithEqualElementsArray () {
        setTechnique ( ArrayTestUtil.EQUAL_ELEMENT );
        technique.selectionSort ();
        Assertions.assertEquals ( ArrayTestUtil.SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithNegativeElementsArray () {
        setTechnique ( ArrayTestUtil.NEGATIVE_ARRAY );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testSelectionSortWithMixedElementsArray () {
        setTechnique ( ArrayTestUtil.MIXED_ARRAY );
        technique.selectionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSort () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSortWithReverseOrderElements ( ) {
        setTechnique ( ArrayTestUtil.REVERSE_SORTED );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSortWithSingleElementArray () {
        setTechnique ( ArrayTestUtil.SINGLE_ELEMENT );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_SINGLE_ELEMENT_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSortWithDuplicates () {
        setTechnique ( ArrayTestUtil.WITH_DUPLICATES );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_ARRAY_WITH_DUPLICATES, technique.toString () );
    }

    @Test
    public void testInsertionSortWithAlreadySortedArray () {
        setTechnique ( ArrayTestUtil.ALREADY_SORTED );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSortWithEqualElementsArray () {
        setTechnique ( ArrayTestUtil.EQUAL_ELEMENT );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_EQUAL_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSortedWithNegativeElementsArray () {
        setTechnique ( ArrayTestUtil.NEGATIVE_ARRAY );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NEGATIVE_ELEMENTS_ARRAY, technique.toString () );
    }

    @Test
    public void testInsertionSortWithMixedElementsArray () {
        setTechnique ( ArrayTestUtil.MIXED_ARRAY );
        technique.insertionSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_MIXED_ELEMENTS_ARRAY, technique.toString () );
    }

}
