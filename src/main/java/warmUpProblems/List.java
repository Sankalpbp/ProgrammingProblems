package warmUpProblems;

public interface List {

    int getLength();

    int at(int i) throws ArrayIndexOutOfBoundsException;

    void set(int i, int value) throws ArrayIndexOutOfBoundsException;

    void add(int value);

    void add(int i, int value) throws ArrayIndexOutOfBoundsException;

    void remove(int i) throws ArrayIndexOutOfBoundsException;

    void remove() throws ArrayIndexOutOfBoundsException;

    int first() throws ArrayIndexOutOfBoundsException;

    int last() throws ArrayIndexOutOfBoundsException;

}
