package Backtracking;

import java.util.Scanner;

public class Suduko {
    public static boolean safe(int mat[][],int row,int col,int num){
        
        //check entire row
        for(int i=0;i<9;i++){
            if(mat[row][i]==num){
                return false;
            }
        }
        //check entire column
        for(int i=0;i<9;i++){
            if(mat[i][col]==num){
                return false;
            }
        }
        //check the sub-matrix 3X3
        int srow=row-(row%3);
        int scol=col-(col%3);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(mat[i+srow][j+scol]==num)
                return false;
            }
        }
        return true;
    }

    public static boolean solve(int mat[][],int row,int col){

        if(row==8 && col==9)
        return true;

        if(col==9){
            row++;
            col=0;
        }
        if(mat[row][col]!=0)
        return solve(mat,row,col+1);

        for(int i=1;i<=9;i++){
            if(safe(mat,row,col,i)){
                mat[row][col]=i;
                if(solve(mat,row,col+1))
                return true;

                mat[row][col]=0;
            }
        }
        return false;
    }
    
    public static void print(int mat[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int mat[][]=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        sc.close();
        if(solve(mat,0,0))
        print(mat);
        else
        System.out.print("No Solution");
    }
}
