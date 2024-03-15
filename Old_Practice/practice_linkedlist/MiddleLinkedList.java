package Java.practice_linkedlist;

public class MiddleLinkedList {

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

        newNode.next = head;
        head = newNode;
    }

    private void getMiddle() {

        if(head == null || head.next == null) {
            return;
        }

        Node firstNode = head;
        Node secondNode = head;
        while (secondNode != null && secondNode.next != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next.next;
        }
        System.out.println(firstNode.data + "got");
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
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();
        middleLinkedList.insertData("10");
        middleLinkedList.insertData("20");
        middleLinkedList.insertData("30");
        middleLinkedList.insertData("40");
        middleLinkedList.insertData("50");
        middleLinkedList.insertData("60");
        middleLinkedList.printNode();
        System.out.println();
        middleLinkedList.getMiddle();
    }
    
}
