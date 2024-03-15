package Java.practice_linkedlist;

public class SearchNodeRec {

    Node head;

    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertFirst(String data) {

        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    private boolean SearchNode(Node head, String data) {

        if(head == null) {
            return false;
        }

        if(head.data == data)
            return true;

        return SearchNode(head.next, data);
    }

    public static void main(String[] args) {
        SearchNodeRec rec = new SearchNodeRec();
        rec.insertFirst("10");
        rec.insertFirst("20");
        rec.insertFirst("30");
        rec.insertFirst("40");
        if(rec.SearchNode(rec.head, "70")) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
    
}
