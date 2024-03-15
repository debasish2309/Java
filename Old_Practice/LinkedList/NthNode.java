package Old_Practice.LinkedList;

public class NthNode {

    Node head;

    class Node{
        int data ;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private void insertLast(int data){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node currData = head;
        while(currData.next != null) {
            currData = currData.next;
        }

        currData.next = newNode;
    }

    // time complexity : O(n) Space Complexity: O(1)
    private int getIndex(int position){

        if(position == 0) {
            return head.data;
        }

        int count = 0;
        Node currNode = head;

        while(currNode != null) {
            if(count == position){
                return currNode.data;
            }
            count++;
            currNode = currNode.next;
        }

        assert(false);
        return 0;

    }

    public void printList() {
        if(head == null) {
            System.out.println("there is no data ");
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
        NthNode list = new NthNode();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.printList();
        System.out.println(list.getIndex(3));
    }
    
}
