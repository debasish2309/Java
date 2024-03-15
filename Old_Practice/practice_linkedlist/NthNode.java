package Java.practice_linkedlist;

public class NthNode {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertData(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    private void getIndex(int pos) {
        if(head == null) {
            System.out.println("there is no ");
           return;
        } 

        Node currNode = head;
        int count = 0 ;

        while(currNode != null) {
            if(count == pos) {
                System.out.println(count + " -> " + currNode.data);
                return;
            }
            currNode = currNode.next;
            count++;
        }
    }

    private void printNode() {
        if(head == null) {
            System.out.println("there is no ");
           return;
        } 

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        NthNode nthNode = new NthNode();
        nthNode.insertData("10");
        nthNode.insertData("20");
        nthNode.insertData("30");
        nthNode.insertData("40");
        nthNode.printNode();
        System.out.println();
        nthNode.getIndex(2);
    }
    
}
