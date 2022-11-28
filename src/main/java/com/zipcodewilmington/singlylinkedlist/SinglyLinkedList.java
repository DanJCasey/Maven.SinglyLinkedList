package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(T data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Integer size() {
        Integer count = 0;
        Node current = this.head;
        count = current.next == null ? 0 : 1;
        while(current.next  != null) {
            count++;
            current = current.next;

        }
        return count;
    }

    public Integer find(T valueToFind) {
        Node current = this.head;
        Integer index = 0;
        if(current == null)
            return -1;
        while(current != null) {
            if(current.data.equals(valueToFind))
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }
    public Boolean contains(T valueToFind){
        return this.find(valueToFind) >= 0;
    }
}
