package Old_Practice.LinkedList;
public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //add - last
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

    // delete - first
    public void deleteFirst() {
        if(head == null) {
            System.out.print("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete - last
    public void deleteLast() {
        if(head == null) {
            System.out.print("the list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int Size() {
        return size;
    }

    // reverse linked list - space complexity - O(1) time complexity - O(n)
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // print 
    public void printList() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " -> " );
            currentNode = currentNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

    //    list.addLast("list");
    //    list.printList();

    //    list.addFirst("this");
    //    list.printList();

    //    list.deleteFirst();
    //    list.printList();

    //    list.deleteLast();
    //    list.printList();

    //    System.out.println(list.Size());

        list.head =  list.reverseRecursive(list.head);
        list.printList();
        
    } 
}
