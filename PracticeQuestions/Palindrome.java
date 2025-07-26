package PracticeQuestions;

import java.util.Scanner;

public class Palindrome {

    public static boolean Palindromecheck(String s){
        if(s==null|| s.length()<=0) return false;

        int left=0,right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        sc.close();
        if(Palindromecheck(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
