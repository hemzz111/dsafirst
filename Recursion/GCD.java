package Recursion;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.print(gcd(a, b));
    }
}
