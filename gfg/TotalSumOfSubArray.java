package gfg;

import java.util.Scanner;

public class TotalSumOfSubArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        sc.close();
        
        int totalsum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int sum=arr[i]*(i+1)*(n-i);
            totalsum+=sum;
        }
        System.out.print("Total Sum: "+totalsum);
    }
}
