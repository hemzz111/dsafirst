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
public class LevelOrderTraversal {
    Node root=null;

    void insert(int data){
        Node newnode=new Node(data);

        if(root==null) return;

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
            inorder(root.left);
            System.out.print(root.data+" ");
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
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int n=sc.nextInt();
        LevelOrderTraversal l=new LevelOrderTraversal();

        System.out.println("Enter the "+n+" number of values: ");
       // Node root=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            sc.close();
            l.insert(val);
        }
        System.out.println("Inorder Traversal: ");
        l.inorder(l.root);
        System.out.println();

        System.out.println("Level Order Traversal: ");
        l.levelorder(l.root);
    }
}
