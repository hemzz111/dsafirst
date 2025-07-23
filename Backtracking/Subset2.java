package Backtracking;

import java.util.*;
public class Subset2 {

    static int count=0;

    public static void solve(int i,int arr[],int size,int tar){

        if(tar==0){
            count++;
            return;
        }

        if(tar<0 || i>=size){
            return;
        }
        solve(i+2,arr,size,tar-arr[i]);
        solve(i+1,arr,size,tar);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();

        sc.close();
        solve(0,arr,n,tar);

        System.out.print(count);

    }   
}
