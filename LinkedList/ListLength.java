
import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class ListLength {
    public static int countvalue(Node head){
        int count=0;
        while(head!=null){
            count++;

            head=head.next;
        }
        return count;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the node: ");

        int n=sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.println("Empty list");
            return;
        }
        //System.out.println("Enter the data to insert into the node: ");
        int data=sc.nextInt();
        Node head=new Node(data);
        Node curr=head;
        
        for(int i=2;i<=n;i++){
            data=sc.nextInt();
            sc.close();
            curr.next=new Node(data);
            curr=curr.next;
        }
        System.out.print(countvalue(head));
    }
}

//Recursive approach
/* 
public static int countvalue(Node head){
    int count=0;

    if(head==null){
    System.out.println();
    return;
    }

    return 1+countvalue(head.next);

}
*/