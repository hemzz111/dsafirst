package Recursion;

import java.util.Scanner;

public class LCMof3Num {
    public static int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
    public static int lcm(int a,int b){
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        
        int lcm2=lcm(a,b);
        int lcm3=lcm(lcm2,c);

        System.out.print(lcm3);
    }
}
