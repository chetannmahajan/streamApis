package org.example.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addElementLast("a");
        linkedList.addElementLast("b");
        linkedList.addElementLast("c");
        linkedList.addElementLast("d");
        linkedList.addElementLast("e");
        linkedList.deleteElementAtIndex(3);



        linkedList.printLinkedList();
    }
}
