package warmUpProblems;

public enum ArrayInputType {
    SINGLE_ELEMENT ( "array with single elements" ),
    EQUAL_ELEMENT ( "array with equal elements" ),
    ALREADY_SORTED ( "array with already sorted elements" ),
    REVERSE_SORTED ( "array with reverse sorted elements" ),
    WITH_DUPLICATES ( "array with some duplicates" ),
    NORMAL_ARRAY ( "array with normal elements jumbled together, but all positive" ),
    NEGATIVE_ARRAY ( "array with all negative elements" ),
    MIXED_ARRAY ( "array with both positive, negative elements and zero" ),
    SPECIAL_ARRAY ( "array with random big and small elements" );

    private String type;

    private ArrayInputType ( String type ) {
        this.type = type;
    }

    public String getType ( ) {
        return this.type;
    }
}
