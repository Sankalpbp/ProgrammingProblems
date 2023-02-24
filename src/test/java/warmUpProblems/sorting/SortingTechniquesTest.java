/*package warmUpProblems.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmUpProblems.ArrayTestUtil;
import warmUpProblems.BasicTest;
import warmUpProblems.SimpleSortingTechnique;

import java.util.Arrays;

public class SortingTechniquesTest implements BasicTest {

    @Override
    @BeforeEach
    public void testSetup () {
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


 */