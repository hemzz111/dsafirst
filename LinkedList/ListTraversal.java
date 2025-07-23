import java.util.*;
class node{
    int data;
    node next;
    
    public node(int data){
        this.data=data;
        next=null;
    }
}
public class ListTraversal{
    
    // Iterative approach

    public static void traversal(node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
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
        node head=new node(data);
        node curr=head;
        
        for(int i=2;i<=n;i++){
            data=sc.nextInt();
            curr.next=new node(data);
            curr=curr.next;
        }
        traversal(head);
    }
}

//Recursive method
/* 
public static void traversal(Node head){
    if(head==null){
        System.out.println();
        return;
    }
    System.out.print(head.data+" ");

    return traversal(head.next);
}
    */