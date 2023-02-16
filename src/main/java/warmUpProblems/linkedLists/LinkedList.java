package warmUpProblems.linkedLists;

import warmUpProblems.List;

import java.util.Objects;

public class LinkedList implements List  {

    private int length;
    private LinkedListNode head;

    public LinkedList ( ) {
        this.length = 0;
        this.head = null;
    }

    @Override
    public int getLength ( ) {
        return this.length;
    }

    @Override
    public String toString ( ) {
        StringBuilder builder = new StringBuilder ();
        builder.append ( "[ " );

        LinkedListNode pointer = this.head;

        if ( pointer == null ) {
            return "[  ]";
        }

        while ( pointer.getNext() != null ) {
            builder.append ( pointer.getData () );
            builder.append ( ", " );
            pointer = pointer.getNext ();
        }

        builder.append ( pointer.getData () );
        builder.append ( " ]" );

        return builder.toString ();
    }

    @Override
    public int at ( int i ) throws NullPointerException {
        LinkedListNode node = head;

        if ( i < 0 || ( i != 0 && this.length <= i ) ) {
            throw new NullPointerException ( "i: " + i + " is not a valid position for this LinkedList object." );
        }

        int position = 0;

        while ( node != null && position < i ) {
            ++position;
            node = node.getNext();
        }

        return Objects.requireNonNull ( node ).getData ();
    }

    @Override
    public void set(int i, int value) throws NullPointerException {
        if ( ( i != 0 && i >= length ) || i < 0 ) {
            throw new NullPointerException ( "i: " + i + " is not a valid position for this LinkedList object." );
        }

        LinkedListNode pointer = this.head;
        int position = 0;

        while ( pointer != null && position < i ) {
            ++position;
            pointer = pointer.getNext ();
        }

        Objects.requireNonNull ( pointer ).setData ( value );
    }

    @Override
    public void add(int value) {
        LinkedListNode newNode = new LinkedListNode ( value );

        if ( this.head == null ) {
            this.head = newNode;
            this.length = 1;
            return;
        }

        LinkedListNode lastNode = this.head;

        while ( lastNode.getNext () != null ) {
            lastNode = lastNode.getNext ();
        }

        lastNode.setNext ( newNode );
        ++this.length;
    }

    @Override
    public void add(int i, int value) throws NullPointerException {
        if ( i < 0 || ( i != 0 && i >= length ) ) {
            throw new NullPointerException ( "i: " + i + " is not a valid position for this LinkedList object." );
        }

        LinkedListNode newNode = new LinkedListNode ( value );

        if ( this.head == null ) {
            this.head = newNode;
            this.length = 1;
            return;
        }

        LinkedListNode pointer = this.head;
        LinkedListNode previous = null;
        int position = 0;

        while ( pointer != null && position < i ) {
            previous = pointer;
            pointer = pointer.getNext ();
            ++position;
        }

        Objects.requireNonNull ( previous ).setNext ( newNode );
        newNode.setNext ( pointer );
        ++this.length;

    }

    @Override
    public void remove(int i) throws NullPointerException {
        if ( i < 0 || ( i != 0 && i >= this.length ) ) {
            throw new NullPointerException ( "i: " + i + " is not a valid position for this LinkedList object." );
        }

        if ( i == this.length - 1 ) {
            this.remove ();
            return;
        }

        LinkedListNode pointer = this.head;
        LinkedListNode previous = null;
        int position = 0;

        while ( pointer != null && position < i ) {
            previous = pointer;
            pointer = pointer.getNext ();
            ++position;
        }

        Objects.requireNonNull ( previous ).setNext ( Objects.requireNonNull ( pointer ).getNext () );
    }

    @Override
    public void remove() throws NullPointerException {
        if ( this.head == null ) {
            throw new NullPointerException ( "There are no elements in the LinkedList." );
        }

        if ( this.head.getNext () == null ) {
            this.length = 0;
            this.head = null;
            return;
        }

        LinkedListNode pointer = this.head;

        while ( pointer.getNext ().getNext () != null ) {
            pointer = pointer.getNext ();
        }

        pointer.setNext ( null );
        --this.length;
    }

    @Override
    public int first() throws NullPointerException {
        if ( Objects.isNull ( this.head ) ) {
            throw new NullPointerException ( "LinkedList has 0 elements." );
        }

        return this.head.getData ();
    }

    @Override
    public int last() throws NullPointerException {
        if ( Objects.isNull ( this.head ) ) {
            throw new NullPointerException ( "LinkedList has 0 elements." );
        }

        LinkedListNode pointer = this.head;

        while ( pointer.getNext () != null ) {
            pointer = pointer.getNext ();
        }

        return pointer.getData ();
    }

}
