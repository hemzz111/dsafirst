package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class LevelOrderTraversal {
    Node root=null;

    Node insert(Node root,int data){
        Node newnode=new Node(data);

        if(root==null) return newnode;

        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp=q.poll();

            if(temp.left==null){
                temp.left=newnode;
                break;
            }
            else q.add(temp.left);

            if(temp.right==null){
                temp.right=newnode;
                break;
            }

            else q.add(temp.right);
        }
       
    }
    void inorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    void levelorder(Node root){
        if(root==null) return;

        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp=q.poll();
            System.out.print(temp.data+" ");

            if(temp.left!=null)
            q.add(temp.left);

            if(temp.right!=null)
            q.add(temp.right);

        }

    }
}
