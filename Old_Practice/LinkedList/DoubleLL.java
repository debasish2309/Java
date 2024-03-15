package Old_Practice.LinkedList;

public class DoubleLL {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public void push(int data){
        Node newData = new Node(data);

        if(head == null) {
            head = newData;
            head.prev = null;
        }
        
        newData.next = head;
        head = newData;
    }

    public void printlist(Node node){
        Node last = null;

        System.out.println("traverse in forward direction");
        while(node != null) {
            System.out.print(node.data + "->");
            last = node;
            node = node.next;
        }

        System.out.println("traverse in backward direction");
        while(last != null){
            System.out.print(last.data + "->");
            last = last.prev;
        }
    }

    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.printlist(list.head);
    }
    
}
