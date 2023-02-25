package warmUpProblems.sorting;

public enum AdvancedSortingTechnique {

    MERGE_SORT ( "Merge Sort" ),
    QUICK_SORT ( "Quick Sort" ),
    COUNTING_SORT ( "Counting Sort" ),
    RADIX_SORT ( "Radix Sort" );

    private String name;

    private AdvancedSortingTechnique(String name ) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

}
