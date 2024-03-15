package Java.practice_linkedlist;

//Exchange first and last nodes in Circular Linked List
public class C_Exchange {

    Node head;

    class Node{
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertEnd(String data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node currNode = head;
        while(currNode.next != head) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = head;
    }

    private void printNode(){
        if(head == null) {
            System.out.println("empty");
            return;
        }
        Node currNode  = head;

        do {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        } while(currNode != head);
    }

    private void exchangeElement(){
        while(head == null) {
            System.out.println("Empty");
            return;
        }

        Node firstNode = head;
        Node SecondNode = head.next;

        while(SecondNode.next != head) {
            
            SecondNode = SecondNode.next;
            firstNode = firstNode.next;
        }
        SecondNode.next = head.next;
        firstNode.next = head;
        head = SecondNode;
        firstNode.next.next = head;
    }

    public static void main(String[] args) {
        C_Exchange circular = new C_Exchange();
        circular.insertEnd("10");
        circular.insertEnd("20");
        circular.insertEnd("30");
        circular.insertEnd("40");
        circular.printNode();
        System.out.println();
        circular.exchangeElement();
        circular.printNode();
    }
    
}
