package Java.practice_linkedlist;

public class Insertion {

    Node head ;
    private int size;

    Insertion(){
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add First
    private void insertFirst(String data) {
    Node new_node = new Node(data);

        if(head == null) {
            head = new_node;
            return;
        } 
        new_node.next = head;
        head = new_node;
    }

    //Addlast
    private void insertLast(String Last) {
        Node new_node = new Node(Last);

        if(head == null) {
            head = new_node;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new_node;
    }

    //delete first
    private void deleteFirst() {
        if(head == null) {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last element 
    private void deleteLast() {
        if(head == null){
            System.out.println("The lost is empty");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {            
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //delete in the middle
    private void deleteMiddle(String data) {
        if(head == null) {
            System.out.println("there is no element");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null) {
            if(lastNode.data == data) {
                secondLast.next = lastNode.next;
            }
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
    } 

    //print List
    private void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print( currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");     
    }

    public int getSize() {
        return size;
    }

    //Reverse Linked List
    private void ReverseIterate() {
        if(head == null | head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        if(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        insertion.insertLast("10");
        insertion.insertLast("20");
        insertion.insertLast("30");
        insertion.insertLast("40");
        insertion.deleteLast();

        insertion.printList();
        System.out.println();
        System.out.println( insertion.getSize());
        insertion.deleteMiddle("30");
        insertion.printList();
    }
    
}
