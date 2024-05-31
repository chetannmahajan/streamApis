package org.example.LinkedList;

public class LinkedList {
    Node head;

    public void addElementLast(String data){
        Node currentNode = new Node();
        currentNode.data = data;
        currentNode.next = null;

        Node n = head;
        if(head == null){
            head = currentNode;
        }else{
            while(n.next != null){
                n = n.next;
            }
            n.next = currentNode;
        }
    }

    public void addElementAtFirst(String data){
        Node currentNode = new Node();
        currentNode.data = data;
        currentNode.next = head;

        head = currentNode;
    }

    public void addElementAtIndex(int index, String data){

        Node currentNode = new Node();
        currentNode.data = data;
        currentNode.next = null;

        if(index == 0){
            addElementAtFirst(data);
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            currentNode.next = n.next;
            n.next = currentNode;
        }
    }

    public void deleteElementAtIndex(int index){

        Node n = head;
        for (int i=0; i<index-1; i++){
            n = n.next;
        }
        Node n1 = n.next;
        n.next = n1.next;
    }

    public void printLinkedList(){
        Node n = head;
        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
