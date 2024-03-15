package Java.LinkedList;

//Delete the deletes the first occurrence of key in * linked list
public class DeleteFirstOccurance {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    private void deleteKey(int key){
        
        Node temp = head, prev = null;

        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        prev.next = temp.next;
    }

    //insert new node into the list
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList(){
        Node tnode = head;
        while(tnode != null) {
            System.out.print(tnode.data + "-> ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        DeleteFirstOccurance llist = new DeleteFirstOccurance();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.printList();

        llist.deleteKey(1);
        System.out.println( " ");
        llist.printList();
    }
    
}
