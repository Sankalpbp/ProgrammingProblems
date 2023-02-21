package warmUpProblems.sorting;

public class SimpleSortingTechniques extends SortingTechniques {

    public SimpleSortingTechniques ( ) {
        super ();
    }

    public SimpleSortingTechniques ( int [] array ) {
        super ( array );
    }

    public void bubbleSort ( ) {
        int size = super.getSize ();
        for ( int i = 0; i < size - 1; ++i ) {
            for ( int j = size - 1; j >= 1; --j ) {
                if ( super.get ( j ) < super.get ( j - 1 ) ) {
                    int temp = super.get ( j );
                    super.set ( j, super.get ( j - 1 ) );
                    super.set ( j - 1, temp );
                }
            }
        }
    }

    public void selectionSort () {
        int size = super.getSize ();
        for ( int i = 0; i < size - 1; ++i ) {
            int indexOfMinimumElement = -1;
            int minimumElement = Integer.MAX_VALUE;
            for ( int j = i; j < size; ++j ) {
                if ( minimumElement > super.get ( j ) ) {
                    minimumElement = super.get ( j );
                    indexOfMinimumElement = j;
                }
            }

            int temp = super.get ( i );
            super.set ( i, super.get ( indexOfMinimumElement ) );
            super.set ( indexOfMinimumElement, temp );
        }
    }

    public void insertionSort () {
        int size = super.getSize ();
        for ( int i = 1 ; i < size; ++i ) {
            int savedElement = super.get ( i );
            int j = i - 1;

            while ( j >= 0 && super.get ( j ) > savedElement ) {
                super.set ( j + 1, super.get ( j ) );
                --j;
            }

            super.set ( j + 1, savedElement );
        }

    }

}
