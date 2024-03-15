package Java.practice_linkedlist;

public class SearchNode {

    Node head;
    private int size;

    class Node{

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null; 
            size++;
        }

    }

    private void insertend(String data) {
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

    private boolean searchItem(String item) {
        if(head == null) {
            System.out.println("there is no iten in the Lsis");
            return false;
        }

        Node currNode = head;
        while(currNode != null) {
            if(currNode.data == item) {
                System.out.println("found");
                return true;
            } else {
                currNode = currNode.next;
            }
        }
        return false;
    }

    private void printList() {
        if(head == null) {
            System.out.println("the List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    } 

    public static void main(String[] args) {
        SearchNode node = new SearchNode();
        node.insertend("10");
        node.insertend("20");
        node.insertend("30");
        node.insertend("40");
        node.searchItem("70");
        node.printList();
        System.out.println();
        System.out.println(node.size);
    }
    
}
