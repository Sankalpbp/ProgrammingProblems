package warmUpProblems.sorting;

public enum SimpleSortingTechnique {
    BUBBLE_SORT ( "Bubble Sort" ),
    INSERTION_SORT ( "Insertion Sort" ),
    SELECTION_SORT ( "Selection Sort" );

    private SimpleSortingTechnique ( String name ) {
        this.name = name;
    }

    private String name;

    public String getName () {
        return this.name;
    }
}