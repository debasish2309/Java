package Old_Practice.LinkedList;

public class InsertionLinkedList {

    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // insert - first position
    private void insertFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // insert - Add a node after a given node
    private void insertAfter(Node prev_node, String data){
        
        if(prev_node == null){
            System.out.println("the given previous cannot be null");
            return;
        }
        Node new_node = new Node(data);
        //make next of new node as next of prev_node
        new_node.next = prev_node.next;
        //make next of prev_node as new_node
        prev_node.next = new_node;
    }

    private void insertLast(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

    }

    private void deleteNode() {
        if(head == null) {
            System.out.println("the node is empty");
            return;
        }

        head = head.next;
    }

    private void printList(){
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertionLinkedList list = new InsertionLinkedList();
        list.insertFirst("1");
        list.insertFirst("2");
        list.insertFirst("3");
        list.insertFirst("4");
        list.insertAfter(list.head.next, "5");
        list.insertLast("6");
        list.deleteNode();
        list.printList();
    }
    
}
