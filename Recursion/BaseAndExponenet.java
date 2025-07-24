package Recursion;

import java.util.Scanner;

public class BaseAndExponenet {
    public static long power(long base,int expo){
        if(expo==0){
            return 1;
        }
        return base*power(base,expo-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long base=sc.nextInt();
        int expo=sc.nextInt();

        sc.close();
        System.out.println(power(base,expo));
    }
    
}
