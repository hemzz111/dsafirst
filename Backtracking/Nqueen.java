package Backtracking;

import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}
public class Nqueen {
    static int count=0;

    public static void solve(int mat[][],int col,int size){

        if(col==size){
            count++;
            return;
        }
        for(int row=0;row<size;row++){

            if(safe(mat,row,col,size)){
                mat[row][col]=1;
                solve(mat,col+1,size);
                mat[row][col]=0;
            }
        }
    }

    public static boolean safe(int mat[][],int row,int col,int size){

        for(int j=0;j<col;j++){
            if(mat[row][j]==1)
                return false;
            }
           // sc.close();
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--){
            if(mat[i][j]==1) return false;
        }

        for(int i=row+1,j=col-1;i<size && j>=0;i++,j--){
            if(mat[i][j]==1) return false;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        sc.close();
        int mat[][]=new int[n][n];

        solve(mat,0,n);

        System.out.print(count);
    }
}
