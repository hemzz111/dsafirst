package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramcheck {


    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) 
        return false;

        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String s1=sc.next();
        System.out.println("Enter the second string: ");

        String s2=sc.next();
        sc.close();
        
        if(anagram(s1,s2)==true)
        System.out.print("The given strings are anagram.");
        else
        System.out.print("The given strings are not anagram.");
    }
}
