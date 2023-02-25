package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.ArrayInputType;
import warmUpProblems.BasicTest;
import warmUpProblems.ArrayTestUtil;

import java.util.Arrays;

public class AdvancedSortingTechniquesTest implements BasicTest {

    private AdvancedSortingTechniques technique;

    @Override
    @BeforeEach
    public void testSetup () {
        technique = new AdvancedSortingTechniques ();
    }

    private void setTechnique ( ArrayInputType arrayInputType ) {
        switch ( arrayInputType ) {
            case SINGLE_ELEMENT -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setSingleElementArray ( technique );
            case EQUAL_ELEMENT -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setEqualElementsArray ( technique );
            case ALREADY_SORTED -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setSortedElementsArray ( technique );
            case REVERSE_SORTED -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setReversedSortedArray ( technique );
            case MIXED_ARRAY -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setMixedNegativePositiveArray ( technique );
            case NORMAL_ARRAY -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setNormalArray ( technique );
            case WITH_DUPLICATES -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setArrayWithDuplicates ( technique );
            case NEGATIVE_ARRAY -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setNegativeElementsArray ( technique );
            case SPECIAL_ARRAY -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setSpecialArray ( technique );
        }

    }

    @Test
    public void testSort () {
        int count = 0;
        for ( ArrayInputType arrayInputType : ArrayInputType.values () ) {
            setTechnique ( arrayInputType );
            for ( AdvancedSortingTechnique sortingTechnique : AdvancedSortingTechnique.values () ) {

                if ( ( sortingTechnique.equals ( AdvancedSortingTechnique.COUNTING_SORT )
                        || sortingTechnique.equals ( AdvancedSortingTechnique.RADIX_SORT ) )
                        && ( arrayInputType.equals ( ArrayInputType.NEGATIVE_ARRAY )
                        || arrayInputType.equals ( ArrayInputType.MIXED_ARRAY ) ) ) {
                    continue;
                }

                ++count;

                switch ( sortingTechnique ) {
                    case MERGE_SORT -> technique.mergeSort ();
                    case QUICK_SORT -> technique.quickSort ();
                    case COUNTING_SORT -> technique.countingSort ();
                    case RADIX_SORT -> technique.radixSort ();
                }

                Assertions.assertEquals ( ArrayTestUtil.sortedForUnsorted.get ( arrayInputType ).getOutput (),
                        technique.toString (),
                        sortingTechnique.getName() + " failed for " + arrayInputType.getType() + ": "
                        + Arrays.toString(technique.getArray() ) );

            }
        }

        Assertions.assertEquals ( 32, count );
    }

}
