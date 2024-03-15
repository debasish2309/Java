package Java.practice_linkedlist;

//Convert a single linked list to a circular linked list
public class C_Covert {

    Node head;
    private int size;

    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size = 0;
        }
    }

    private void insertEnd(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        size++;
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    private void printNodes() {
        if(head == null) {
            System.out.println("nothing");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    private void changeCircular() {
        if(head == null) {
            System.out.println("Nothing");
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = head;

        while(currNode.next != null) {
            if(currNode.next == head) {
                System.out.println("circular");
                return;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        C_Covert circular = new C_Covert();
        circular.insertEnd("10");
        circular.insertEnd("20");
        circular.insertEnd("30");
        circular.insertEnd("40");
        circular.printNodes();
        System.out.println();
        circular.changeCircular();
    }
    
}
