package Java.practice_linkedlist;

public class C_Insertion {

    Node head;
    Node tail;

    class Node{
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertStart(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;

    }

    public void insertEnd(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        newNode.next = head;
    }

    private void deleteFirst() {
        if(head == null) {
            System.out.println("Empty");
            return;
        }

        Node temp = head;
        temp = temp.next;
        head = temp;
        tail.next = head;
    }

    private void deleteLast() {
        Node prev = head;
        Node curr = head.next;
        while(curr.next != head) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = head;
        tail = prev;
    }
    

    private void printNode() {
        if(head == null) {
            System.out.println("nothing");
            return;
        }

        Node currNode = head;
        do {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        } while(currNode != head) ;
    }

    public static void main(String[] args) {
        C_Insertion insertion = new C_Insertion();
        insertion.insertEnd("10");
        insertion.insertEnd("20");
        insertion.insertEnd("30");
        insertion.insertEnd("40");
        insertion.insertEnd("50");
        insertion.printNode();
        // System.out.println();
        // insertion.deleteLast();
        // insertion.printNode();

    }
    
}
