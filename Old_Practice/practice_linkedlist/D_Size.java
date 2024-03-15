package Java.practice_linkedlist;

public class D_Size {

    Node head;
    private int size;
    
    D_Size() {
        size = 0;
    }

    class Node{
        String data;
        Node prev;
        Node next;
        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
            size++;
        }
    }

    private void insertionFirst(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    

    public static void main(String[] args) {
        D_Size insertion = new D_Size();
        insertion.insertionFirst("10");
        insertion.insertionFirst("20");
        insertion.insertionFirst("30");
        insertion.insertionFirst("40");
        insertion.insertionFirst("50");
        System.out.println(insertion.size);
    }
    
}
