package Basics;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();
        
        int org=n;
        int rev=0;

        while(n!=0){
            rev=n%10;
            rev=rev*10;;
            n=n/10;
        }
        if(org==rev){
            System.out.print("True");
        }
        else{
            System.out.println("False");
        }

    }
}
