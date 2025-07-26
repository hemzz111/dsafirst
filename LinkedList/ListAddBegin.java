import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}

public class ListAddBegin {
    public static Node insert(Node head,int data){
        Node newnode=new Node(data);

        newnode.next=head;

        return newnode;

    }
    public static void traversal(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the node: ");
        int n=sc.nextInt();
       
        sc.close();

        if(n<=0){
            System.out.print("Empty list.");
            return;
        }
       // System.out.println("Enter the data to insert the node: ");
        int data=sc.nextInt();
        Node head=new Node(data);
        Node curr=head;

        sc.close();
        for(int i=2;i<=n;i++){
            data=sc.nextInt();
            curr.next=new Node(data);
            curr=curr.next;
        }
        
        System.out.print("Before insert a new node: ");
        traversal(head);

        data=sc.nextInt();
        System.out.print("After insert a new node: ");
        head=insert(head,data);
        traversal(head);
    }
}
