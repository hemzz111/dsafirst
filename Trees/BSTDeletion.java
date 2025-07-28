package Trees;

import java.util.Scanner;

class node{
    int data;
    node left,right;

    public node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTDeletion {
    node root=null;
    public node insert(node root,int data){
        node newnode=new node(data);
        if(root==null)
        return newnode;

        if(data<root.data)
        root.left=insert(root.left, data);

        if(data<root.data)
        root.right=insert(root.right,data);

        return root;
    }
    public static node delete(node root,int key){
        if(root==null)
        return null;

        if(key<root.data)
        root.left=delete(root.left,key);

        if(key>root.data)
        root.right=delete(root.right,key);

        else{
            if(root.left==null && root.right==null) return null;

            else if(root.left==null) return root.right;

            else if(root.right==null) return root.left;

            else{
                node suc=findmin(root.right);
                root.data=suc.data;
                root.right=delete(root.right,suc.data);
            }
        }
        return root;
    }
    node findmin(node root){
        if(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        BSTDeletion b=new BSTDeletion();
        
        node root=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            root=b.insert(root,val);
        }
        int key=sc.nextInt();
      delete(root,key);
        //b.inorder(root);
    }
}
