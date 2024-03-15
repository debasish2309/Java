package Old_Practice.LinkedList;

public class NthNodeFromLast {

    Node head;
    private int size;

    NthNodeFromLast() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    private void insertLast(int data) {
        Node newdata = new Node(data);

        if(head == null) {
            head = newdata;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newdata;
    }

    private int getSize(){
        return size;
    }

    // time complexity : O(n) space complexity: O(1)
    private int getIndex(int position) {
        if(head == null) {
            System.out.println("there is no data in the array");
            return 0;
        }

        Node currNode = head;
        int count = 0;
        while(currNode != null) {
            if(count == (size - position) ){
                return currNode.data;
            }
            count++;
            currNode = currNode.next;

        }
        return 0;
    }

    private void printList() {
        if(head == null) {
            System.out.println("there is no item");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        NthNodeFromLast list = new NthNodeFromLast();
        list.insertLast(35);
        list.insertLast(15);
        list.insertLast(4);
        list.insertLast(20);
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.getIndex(4));
    }
    
}
