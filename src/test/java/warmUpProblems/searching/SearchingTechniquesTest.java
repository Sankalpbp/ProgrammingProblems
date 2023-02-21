package warmUpProblems.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.ArrayTestUtil;
import warmUpProblems.BasicTest;

public class SearchingTechniquesTest implements BasicTest {

    private SearchingTechniques technique;

    @Override
    @BeforeEach
    public void testSetup ( ) {
        technique = new SearchingTechniques ();
    }

    private void setTechnique ( final String arrayType ) {
        switch ( arrayType ) {
            case ArrayTestUtil.SINGLE_ELEMENT -> technique = ( SearchingTechniques ) ArrayTestUtil.setSingleElementArray ( technique );
            case ArrayTestUtil.EQUAL_ELEMENT -> technique = ( SearchingTechniques ) ArrayTestUtil.setEqualElementsArray ( technique );
            case ArrayTestUtil.ALREADY_SORTED -> technique = ( SearchingTechniques ) ArrayTestUtil.setSortedElementsArray ( technique );
            case ArrayTestUtil.REVERSE_SORTED -> technique = ( SearchingTechniques ) ArrayTestUtil.setReversedSortedArray ( technique );
            case ArrayTestUtil.MIXED_ARRAY -> technique = ( SearchingTechniques ) ArrayTestUtil.setMixedNegativePositiveArray ( technique );
            case ArrayTestUtil.NORMAL_ARRAY -> technique = ( SearchingTechniques ) ArrayTestUtil.setNormalArray ( technique );
            case ArrayTestUtil.WITH_DUPLICATES -> technique = ( SearchingTechniques ) ArrayTestUtil.setArrayWithDuplicates ( technique );
            case ArrayTestUtil.NEGATIVE_ARRAY -> technique = ( SearchingTechniques ) ArrayTestUtil.setNegativeElementsArray ( technique );
        }

    }

    @Test
    public void testLinearSearch () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );

        Assertions.assertEquals ( 3, technique.linearSearch ( 2 ) );
    }

    @Test
    public void testBinarySearch () {
        setTechnique ( ArrayTestUtil.ALREADY_SORTED );

        Assertions.assertEquals ( 2, technique.binarySearch ( 3 ) );
    }

}
