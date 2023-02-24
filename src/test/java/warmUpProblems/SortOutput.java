package warmUpProblems;

public enum SortOutput {
    SORTED_NORMAL_ARRAY ( "[ 1, 2, 3, 4, 5, 6 ]" ),
    SORTED_EQUAL_ELEMENTS_ARRAY ( "[ 1, 1, 1, 1, 1, 1 ]" ),
    SORTED_SINGLE_ELEMENT_ARRAY ( "[ 1 ]" ),
    SORTED_ARRAY_WITH_DUPLICATES ( "[ 1, 1, 2, 2, 3, 3 ]" ),
    SORTED_NEGATIVE_ELEMENTS_ARRAY ( "[ -6, -5, -4, -3, -2, -1 ]" ),
    SORTED_MIXED_ELEMENTS_ARRAY ( "[ -999, -1, 0, 1, 6, 134 ]" ),
    SORTED_SPECIAL_ARRAY ( "[ 2, 37, 73, 194, 461, 923 ]" );

    private String output;

    private SortOutput ( String output ) {
        this.output = output;
    }

    public String getOutput ( ) {
        return this.output;
    }

}