package Jan_Practice.LinkedList;

public class BasicOperations {

    Node head;
    private int size;

    BasicOperations() {
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //inserting node at the first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //inserting node at the last
    public void addLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = new Node(data);
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    //Deleting node fron the start
    public void DeleteStart() {
        if(head == null) {
            System.out.println("the node is empty");
            return;
        }

        head = head.next;
    }

    //Deleting  the last item of the node
    public void DeleteLast(){
        if(head == null) {
            System.out.println("The node is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node first = head;
        Node second = head.next;
        while(second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = null;
    }

    // reverse linked list - space complexity - O(1) time complexity - O(n)
    public void reverseIterate() {

        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }


    public void printList() {
        if(head == null) {
            System.out.println("there is no item in the list");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        BasicOperations operations = new BasicOperations();
        operations.addLast("first");
        operations.addLast("second");
        operations.addLast("third");
        operations.addLast("forth");
        operations.addLast("fifth");
        operations.printList();
        operations.DeleteStart();
         operations.printList();
         operations.DeleteLast();
         operations.printList();

        
    }
    
}
