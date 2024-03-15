package Java.practice_linkedlist;

public class D_Insertion {

    Node head;
    Node tail;

    class Node{
        String data;
        Node prev;
        Node next;
        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null; 
        }
    }

    private void insertStart(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    private void insertEnd(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    private void insertPosition(String data, int pos) {

        Node newNode = new Node(data);
        Node currNode = head;
        Node nextNode = head.next;
        for(int i = 0; i < pos - 1;i++) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        newNode.prev = currNode;
        newNode.next = nextNode;
        currNode.next = newNode;
        nextNode.prev = newNode;
        
    }

    private void deleteFirst() {
        if(head == null) {
            System.out.println("nothing");
            return;
        }
        // Node temp = head;
        // temp = temp.next;
        // head = temp;
        // head.prev = null;
        head = head.next;
        head.prev = null;
    }

    private void deleteLast() {
        if(head == null) {
            System.out.println("nothing");
            return;
        }

        // Node temp = tail;
        // temp = tail.prev;
        // temp.next = null;
        tail = tail.prev;
        tail.next = null;
    }

    private void deletePos(int pos) {
        Node currNode = head;
        Node nextNode = head.next;
        for(int i = 0 ; i < pos - 1; i++) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        currNode.next = nextNode.next;
        nextNode.next.prev = currNode;
    }

    private void printNode() {
        if(head == null) {
            System.out.println("empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        D_Insertion insertion = new D_Insertion();
        insertion.insertEnd("10");
        insertion.insertEnd("20");
        insertion.insertEnd("30");
        insertion.insertEnd("40");
        insertion.insertEnd("50");
        insertion.insertPosition("90", 3);
        insertion.printNode();
        System.out.println();
      //  insertion.deleteLast();
        // insertion.deleteLast();
        insertion.deletePos( 4);
         insertion.printNode();
    }
    
}
