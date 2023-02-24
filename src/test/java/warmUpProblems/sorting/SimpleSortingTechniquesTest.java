package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.*;

import java.util.Arrays;

public class SimpleSortingTechniquesTest implements BasicTest  {

    private SimpleSortingTechniques technique;

    @Override
    @BeforeEach
    public void testSetup () {
        technique = new SimpleSortingTechniques ();
    }

    private void setTechnique ( ArrayInputType arrayInputType ) {
        switch ( arrayInputType ) {
            case SINGLE_ELEMENT -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSingleElementArray ( technique );
            case EQUAL_ELEMENT -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setEqualElementsArray ( technique );
            case ALREADY_SORTED -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSortedElementsArray ( technique );
            case REVERSE_SORTED -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setReversedSortedArray ( technique );
            case MIXED_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setMixedNegativePositiveArray ( technique );
            case NORMAL_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setNormalArray ( technique );
            case WITH_DUPLICATES -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setArrayWithDuplicates ( technique );
            case NEGATIVE_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setNegativeElementsArray ( technique );
            case SPECIAL_ARRAY -> technique = ( SimpleSortingTechniques ) ArrayTestUtil.setSpecialArray ( technique );
        }

    }

    @Test
    public void testSort () {

        int count = 0;

        for ( ArrayInputType arrayInputType : ArrayInputType.values () ) {
            setTechnique ( arrayInputType );
            for ( SimpleSortingTechnique sortingTechnique : SimpleSortingTechnique.values () ) {
                ++count;
                switch ( sortingTechnique ) {
                    case BUBBLE_SORT -> technique.bubbleSort ();
                    case INSERTION_SORT -> technique.insertionSort ();
                    case SELECTION_SORT -> technique.selectionSort ();
                }

                Assertions.assertEquals ( ArrayTestUtil.sortedForUnsorted.get ( arrayInputType ).getOutput (),
                        technique.toString (),
                        sortingTechnique.getName () + " failed for " + arrayInputType.getType () + ": "
                        + Arrays.toString ( technique.getArray () ) );
            }
        }

        Assertions.assertEquals ( 27, count );
    }

}
