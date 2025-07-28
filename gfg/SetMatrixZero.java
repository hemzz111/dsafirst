package gfg;

import java.util.*;

public class SetMatrixZero {

    public static void SetZero(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;

        boolean []row=new boolean[n];
        boolean []col=new boolean[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]||col[j])
                mat[i][j]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix length: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        System.out.println("Enter the matrix elements: ");
        int mat[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
             mat[i][j]=sc.nextInt();
            }
           // System.out.println();
           // sc.close();
        }
        System.out.println("Updated matrix: ");
        SetZero(mat);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
            sc.close();
        }

        
    }
}
