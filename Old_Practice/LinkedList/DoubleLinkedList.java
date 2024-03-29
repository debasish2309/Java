package Old_Practice.LinkedList;

import java.util.Scanner;

public class DoubleLinkedList {
        
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void Creation() 
    {
        int data,n;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.print("Enter data");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head == null)
        {
            head = new_node;
            tail = new_node;
        }
        else
        {
            head.prev = new_node;
            new_node.next = head;
            head = new_node;
        }
        System.out.print("Do you want to add more data.if yes,press 1");
        n = sc.nextInt();
    }
    while(n == 1);
    }

    public void traverse() {
        Node temp = head;
        if(head == null) 
        {
            System.out.print("LL does exists");;
        }
        else 
        {
            while(temp != null) 
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        ll.Creation();
        ll.traverse();
    }
    
}

