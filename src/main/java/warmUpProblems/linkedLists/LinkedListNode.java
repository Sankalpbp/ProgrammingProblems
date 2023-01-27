package warmUpProblems.linkedLists;

import warmUpProblems.BasicNode;

public class LinkedListNode implements BasicNode {

    private int data;
    private LinkedListNode next;

    @Override
    public void setData(int data) {
        this.data = data;
    }

    @Override
    public void setNext(BasicNode next) {
        this.next = (LinkedListNode) next;
    }

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public LinkedListNode getNext() {
        return this.next;
    }

}
