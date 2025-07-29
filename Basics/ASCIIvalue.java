package Basics;

import java.util.*;
public class ASCIIvalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        sc.close();
        int ascii=ch;

        System.out.println("The ASCII value of "+ch+" is "+ascii);
    }
}
