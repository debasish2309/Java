package Java.practice_linkedlist;

public class ReverseList {

    Node head; 

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertEnd(String data) {
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

    private void Reverse() {
        if(head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null) {
            //store the next pointer
            Node next = curr.next;

            //update the next pointer of the curr to previous
            curr.next = prev;

            ////update prev as current and curr as next
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public void printNode() {
        if(head == null) {
            System.out.println("list empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        reverseList.insertEnd("10");
        reverseList.insertEnd("20");
        reverseList.insertEnd("30");
        reverseList.insertEnd("40");
        reverseList.printNode();
        System.out.println();
        reverseList.Reverse();
        reverseList.printNode();
    }
    
}
