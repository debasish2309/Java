package Old_Practice.LinkedList;

import java.util.Scanner;

public class AllInsertions {
    
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;

    public void Creation() 
    {
        int data,m,n,p;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.print("Enter data");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head == null)
        {
            head = new_node;
        }
        else
        {
            System.out.print("Enter 1 to insert the item in the beginning,2 to insert in the end,3 to insert in a position");
            m = sc.nextInt();
            switch(m)
            {
                case 1:
                new_node.next = head;
                head = new_node;
                break;

                case 2:
                Node temp = head;
                while(temp.next != null)
                {
                    temp = temp.next;
                }
                temp.next = new_node;
                break;

                case 3:
                System.out.print("Enter position of the node to be inserted");
                p = sc.nextInt();
                Node temp1 = head;
                for(int i = 0 ; i <(p - 1); i++) {
                    temp1 = temp1.next;
                }
                new_node.next = temp1.next;
                temp1.next = new_node;

                break;

            }
            
        }
        System.out.print("Do you want to add more data.if yes,press 1");
        n = sc.nextInt();
    }
    while(n == 1);
    }

    public void delete() 
    {
        int data,n,m,p;
        Scanner sc = new Scanner(System.in);
        do
        {
            if(head == null)
            {
                System.out.print("LL is empty");
            }
            else
            {
                System.out.print("Enter 1 to delete from the beginning,Enter 2 to delete from the end,Enter 3 to delete from a position");
                m = sc.nextInt();
                switch(m)
                {
                    case 1:
                    Node temp = head;
                    temp = temp.next;
                    head = temp;
                    break;

                    case 2: 
                    Node temp1 = head;
                    Node ptr = temp1.next;
                    while(ptr.next != null)
                    {
                        temp1 = ptr;
                        ptr = ptr.next;
                    }
                    temp1.next = null;
                    break;

                    case 3:
                    System.out.print("Enter position of the node to be deleted");
                    p = sc.nextInt();
                    Node temp2 = head;
                    Node ptr1 = temp2.next;
                    for(int i = 0 ; i < p-2; i++) {
                        temp2 = ptr1;
                        ptr1 = ptr1.next;
                    }
                    temp2.next = ptr1.next;
                    break;
                }
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
        AllInsertions ll = new AllInsertions();
        ll.Creation();
        ll.delete();
        ll.traverse();

    }
    
}

