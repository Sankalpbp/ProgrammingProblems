package warmUpProblems.sorting;

import warmUpProblems.Techniques;

/**
 * An abstract class extended by classes implementing various sorting techniques
 */
public abstract class SortingTechniques extends Techniques {

    public SortingTechniques ( ) {
        super ();
    }

    public SortingTechniques ( int [ ] array ) {
        super ( array );
    }
}
