package Java.LinkedList;

import java.util.Scanner;

public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void creation() {
        int data,n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if(head == null){
                head = new_node;
                tail = new_node;
                new_node.next = head;
            }
            else {
                new_node.next = head;
                head = new_node;
                tail.next = head;
                break;
            }
            System.out.print("do you want to add more data.If yes, press: 1");
            n = sc.nextInt();
        }
        while(n == 1);
        }

        public void traverse() {
            Node temp = head;
            if(head == null) {
                System.out.print("LL does not exist");
            } 
            else {
                // while(temp != null){
                //     System.out.print(temp.data + " ");
                //     temp = temp.next;
                // }

                do{
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                while(temp != head);
            }
        }

        public static void main(String[] args) {
            CircularLinkedList llist = new CircularLinkedList();
            llist.creation();
            llist.traverse();
        }
    }
    

