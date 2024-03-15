package Java.practice_linkedlist;

public class NthNodeEnd {

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

    private void printNthFromEnd(int n) {
        int len = 0 ;
        Node temp = head;

        //count no of nodes in linef list
        while(temp != null) {
            temp = temp.next;
            len++;
        }

        //check if the value of n is more than len of linked list
        if(len < n)
            return;
            
        temp = head;

        for(int i = 1 ; i < len - n + 1; i++) {
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    private void printData() {
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
        NthNodeEnd nthNodeEnd = new NthNodeEnd();
        nthNodeEnd.insertData("10");
        nthNodeEnd.insertData("20");
        nthNodeEnd.insertData("30");
        nthNodeEnd.insertData("40");
        nthNodeEnd.printData();
        nthNodeEnd.printNthFromEnd(3);
    }
    
}
