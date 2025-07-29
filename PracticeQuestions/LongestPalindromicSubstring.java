package PracticeQuestions;

import java.util.*;

public class LongestPalindromicSubstring {
    public static String LPS(String s){
        if(s==null || s.length()<=0) return "";
        int maxlen=0,start=0;

        for(int i=0;i<s.length();i++){

            int len1=expandfromcenter(s,i,i);
            int len2=expandfromcenter(s,i,i+1);
            int len=Math.max(len1, len2);
    
            if(len>maxlen){
                maxlen=len;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start, start+maxlen);
    }

    public static int expandfromcenter(String s,int left,int right){

        while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        String res=LPS(s);
       System.out.println(res); 
    }
}
