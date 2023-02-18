package warmUpProblems.hashing;

import warmUpProblems.Pair;

import java.util.*;

public class ChainedHashTable {

    private final ArrayList<LinkedList<Pair>> hashTable;
    private int numberOfBuckets;

    public ChainedHashTable () {
        this.hashTable = new ArrayList<>( numberOfBuckets );
        this.numberOfBuckets = 10;

        for ( int i = 0; i < numberOfBuckets ; ++i ) {
            this.hashTable.add ( new LinkedList <> () );
        }
    }

    public void put ( int key, int value ) {
        int bucketNumber = key % 10;
        this.hashTable.get ( bucketNumber ).add ( new Pair ( key, value ) );
    }

    public int get ( int key ) {
        int bucketNumber = key % 10;
        return search ( this.hashTable.get(bucketNumber), key );
    }

    private int search ( LinkedList<Pair> list, int key ) {
        ListIterator<Pair> iterator = list.listIterator ( 0 );

        while ( iterator.hasNext () ) {
            Pair pair = iterator.next ();
            if ( key == pair.getKey () ) {
                return pair.getValue ();
            }
        }

        throw new NoSuchElementException ( "The key: " + key + " is not found in the Hash Table." );
    }

    public boolean search ( int key ) {
        int bucketNumber = key % 10;

        ListIterator<Pair> iterator = this.hashTable.get ( bucketNumber ).listIterator ( 0 );

        while ( iterator.hasNext () ) {
            if ( iterator.next ().getKey () == key ) {
                return true;
            }
        }

        return false;
    }

    public String toString ( ) {

        StringBuilder builder = new StringBuilder ( );
        builder.append ( "[ " );

        for ( LinkedList<Pair> linkedList : this.hashTable) {
            if ( linkedList.isEmpty () ) {
                continue;
            }
            for ( Pair pair : linkedList ) {
                builder.append ( "{ " )
                        .append ( pair.getKey () )
                        .append ( " -> " )
                        .append ( pair.getValue () )
                        .append ( " }" );
            }
            builder.append ( ", " );
        }

        String mapAsString = builder.toString ();
        if ( mapAsString.charAt ( mapAsString.length () - 2 ) == ',' ) {
            mapAsString = mapAsString.substring ( 0, mapAsString.length () - 2 );
        }
        mapAsString = mapAsString.concat ( " ]" );

        return mapAsString;
    }

}
