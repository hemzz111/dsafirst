import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class ListSearch {
    
    public static boolean search(Node head,int key){
        while(head!=null){
            if(head.data==key){
                return true;
            }
            head=head.next;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.print("Empty list.");
            return;
        }
        int data=sc.nextInt();
        Node head=new Node(data);
        Node curr=head;

        for(int i=2;i<=n;i++){
            data=sc.nextInt();
            curr.next=new Node(data);
            curr=curr.next;
        }

        int key=sc.nextInt();

        if(search(head,key))
        System.out.print("Found");
        else 
        System.out.print("Not found");
    }
}
