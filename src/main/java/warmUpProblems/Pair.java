package warmUpProblems;

import java.util.Objects;

public class Pair {
    private int key;
    private int value;

    public Pair ( int key, int value ) {
        this.key = key;
        this.value = value;
    }

    public void setKey ( int key ) {
        this.key = key;
    }

    public void setValue ( int value ) {
        this.value = value;
    }

    public int getKey ( ) {
        return key;
    }

    public int getValue ( ) {
        return value;
    }

    public void setPair ( int key, int value ) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !( o instanceof Pair pair ) ) return false;

        return getKey () == pair.getKey () && getValue () == pair.getValue ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }
}
