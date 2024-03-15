package Java.practice_linkedlist;

//Check weather the linked list is circular or not
public class C_CheckCircular {

    Node head;
    Node tail;

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null; 
        }
    }

    //Insert node at the start
    private void insertStart(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
        
    }

    private void insertEnd(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        newNode.next = head;
    }

    private void CheckList() {
        if(head == null) {
            System.out.println("Sorry three is no item");
            return;
        }

        Node currNode = head;
        while(currNode.next != head  || currNode.next != null) {
            if(currNode.next == head) {
                System.out.println("circular");
                return;
            } 
            if(currNode.next == null){
                System.out.println("singular");
                return;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        C_CheckCircular circular = new C_CheckCircular();
        circular.insertEnd("10");
        circular.insertEnd("20");
        circular.insertEnd("30");
        circular.insertEnd("40");
        System.out.println();
        circular.CheckList();
    }
    
}
