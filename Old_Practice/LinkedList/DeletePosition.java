package Java.LinkedList;

public class DeletePosition {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertData(int data) {
        Node newData = new Node(data);
        if(head == null) {
            head = newData;
            return;
        }

        newData.next = head;
        head = newData;
    }

    private void deletePosition(int position){
        if(head == null){
            return;
        }

        Node temp = head;

        if(position == 0) {
            head = head.next;
            return;
        }

        for(int i = 0 ; temp != null && i < position - 1 ; i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;

        temp.next = next;
    }

    //to delete entire list
    void deletelist() {
        head = null;
    }

    public void printData() {
        
        if(head == null) {
            System.out.println("there is no data in the node");
            return;
        }

        Node tnode = head;
        while(tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        DeletePosition list = new DeletePosition();
        list.insertData(1);
        list.insertData(2);
        list.insertData(3);
        
        list.printData();
        list.deletelist();
        list.printData();

    }
    
}
