package Java.practice_linkedlist;

//Detect loop or cycle in a linked list
//defect not working properly
public class DetectLop {

    Node head;
    
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    private void insertFront(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    private boolean detectLoop() {
        Node hare = head;
        Node turtle = head;

        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare == turtle) {
                return true;
            } 
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLop insertion = new DetectLop();
        insertion.insertFront("10");
        insertion.insertFront("20");
        insertion.insertFront("30");
        insertion.insertFront("40");
        
   //     insertion.head.next.next.next.next = insertion.head.next;
        if(insertion.detectLoop()) {
            System.out.println("loop");
        } else {
            System.out.println("no loop");
        }
    }
    
}
