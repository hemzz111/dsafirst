package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinaryTreeSearchElem {
    
    Node root=null;
    public Node insert(Node root,int data){

        Node newnode=new Node(data);
        
        Queue<Node>q=new LinkedList<>();
        if(root==null)
        return newnode;

        else{
            q.add(root);

            while(!q.isEmpty()){
                Node temp=q.poll();
                
                if(temp.left==null){
                    temp.left=newnode;
                    break;
                }
                else
                q.add(temp.left);

                if(temp.right==null){
                    temp.right=newnode;
                    break;
                }
                else
                q.add(temp.right);
            }
        }
        return root;
    }
    public boolean search(Node root,int key){
        if(root==null){
            return false;
        }

        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();

            if(temp.data==key)
            return true;

            if(temp.left!=null) 
            q.add(temp.left);
            
            if(temp.right!=null)
            q.add(temp.right);
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Node root=null;
        BinaryTreeSearchElem b=new BinaryTreeSearchElem();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            root=b.insert(root, val);
        }

        int key=sc.nextInt();

        sc.close();
        boolean found=b.search(root, key);
        if(found)
        System.out.print("Found");
        else
        System.out.println("Not found");
    }
}
