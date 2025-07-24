package Recursion;

import java.util.Scanner;

public class DigitalRoot {
    public static int find(int n){
        if(n<=9){
            return n;
        }
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return find(sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();
        System.out.println(find(n));
    }
}
