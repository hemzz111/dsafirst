package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    public static int fib(int n){
        if(n==0||n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        sc.close();
        
        System.out.print(fib(n));
    }
}
