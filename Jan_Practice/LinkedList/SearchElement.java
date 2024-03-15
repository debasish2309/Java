package Jan_Practice.LinkedList;

//Search an element in a Linked List (Iterative and Recursive)
public class SearchElement {

    Node head;
    private int size;

    SearchElement() {
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

    public void printList() {
        String key = "third";
        if(head == null) {
            System.out.println("no element found");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
            // if(currentNode.data == key) {
            //     System.out.println("this is it");
            //     return;
            // }
        }
        System.out.println("null");
    }

    public boolean search(Node head, String x)
    {
        // Base case
        if (head == null)
            return false;
 
        // If key is present in current node,
        // return true
        if (head.data == x) {
            return true;
    }
 
        // Recur for remaining list
        return search(head.next, x);
    }

    public int Size() {
        return size;
    }

    public static void main(String[] args) {
        SearchElement operations = new SearchElement();
        operations.addLast("first");
        operations.addLast("second");
        operations.addLast("third");
        operations.addLast("forth");
        operations.addLast("fifth");
        operations.printList();
        if (operations.search(operations.head, "third"))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(operations.Size());
        
    }
    
}
