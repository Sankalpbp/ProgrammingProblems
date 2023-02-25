package warmUpProblems.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.ArrayInputType;
import warmUpProblems.ArrayTestUtil;
import warmUpProblems.BasicTest;

import java.util.Arrays;

public class SearchingTechniquesTest implements BasicTest {

    private SearchingTechniques technique;

    @Override
    @BeforeEach
    public void testSetup ( ) {
        technique = new SearchingTechniques ();
    }

    private void setTechnique ( ArrayInputType arrayInputType ) {
        switch (arrayInputType) {
            case SINGLE_ELEMENT -> technique = (SearchingTechniques) ArrayTestUtil.setSingleElementArray(technique);
            case EQUAL_ELEMENT -> technique = (SearchingTechniques) ArrayTestUtil.setEqualElementsArray(technique);
            case ALREADY_SORTED -> technique = (SearchingTechniques) ArrayTestUtil.setSortedElementsArray(technique);
            case REVERSE_SORTED -> technique = (SearchingTechniques) ArrayTestUtil.setReversedSortedArray(technique);
            case MIXED_ARRAY -> technique = (SearchingTechniques) ArrayTestUtil.setMixedNegativePositiveArray(technique);
            case NORMAL_ARRAY -> technique = (SearchingTechniques) ArrayTestUtil.setNormalArray(technique);
            case WITH_DUPLICATES -> technique = (SearchingTechniques) ArrayTestUtil.setArrayWithDuplicates(technique);
            case NEGATIVE_ARRAY -> technique = (SearchingTechniques) ArrayTestUtil.setNegativeElementsArray(technique);
            case SPECIAL_ARRAY -> technique = (SearchingTechniques) ArrayTestUtil.setSpecialArray(technique);
        }
    }

    @Test
    public void testLinearSearch ( ) {
        int count = 0;

        for ( ArrayInputType arrayInputType : ArrayInputType.values () ) {
            setTechnique ( arrayInputType );
            ++count;

            Assertions.assertEquals ( ArrayTestUtil.searchedValueForArray.get ( arrayInputType ),
                                      technique.linearSearch ( ArrayTestUtil.inputForArray.get ( arrayInputType ) ),
                             "Linear Search failed for " +
                                     arrayInputType.getType () +
                                     " with elements: " +
                                     Arrays.toString ( technique.getArray () ) );
        }

        Assertions.assertEquals ( 9 ,count );
    }

    @Test
    public void testBinarySearch () {
        setTechnique ( ArrayInputType.ALREADY_SORTED );

        Assertions.assertEquals ( 1, technique.binarySearch ( 2 ) );
    }

}
