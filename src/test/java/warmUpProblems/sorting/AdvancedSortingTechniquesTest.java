package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.BasicTest;
import warmUpProblems.ArrayTestUtil;

public class AdvancedSortingTechniquesTest implements BasicTest {

    private AdvancedSortingTechniques technique;

    @Override
    @BeforeEach
    public void testSetup () {
        technique = new AdvancedSortingTechniques ();
    }

    private void setTechnique ( final String arrayType ) {
        switch ( arrayType ) {
            case ArrayTestUtil.NORMAL_ARRAY -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setNormalArray ( technique );
            case ArrayTestUtil.SPECIAL_ARRAY -> technique = ( AdvancedSortingTechniques ) ArrayTestUtil.setSpecialArray ( technique );
        }
    }

    @Test
    public void testMergeSort () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );
        technique.mergeSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testQuickSort () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );
        technique.quickSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testCountingSort () {
        setTechnique ( ArrayTestUtil.NORMAL_ARRAY );
        technique.countingSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_NORMAL_ARRAY, technique.toString () );
    }

    @Test
    public void testRadixSort () {
        setTechnique ( ArrayTestUtil.SPECIAL_ARRAY );
        technique.radixSort ();

        Assertions.assertEquals ( ArrayTestUtil.SORTED_SPECIAL_ARRAY, technique.toString () );
    }

}
