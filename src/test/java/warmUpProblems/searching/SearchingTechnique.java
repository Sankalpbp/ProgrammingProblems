package warmUpProblems.searching;

public enum SearchingTechnique {

    LINEAR_SEARCH ( "Linear Search" ),
    BINARY_SEARCH ( "Binary Search" );

    private SearchingTechnique ( String name ) {
        this.name = name;
    }

    private String name;

    public String getName () {
        return this.name;
    }
}
