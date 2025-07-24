package leetcode;

import java.util.*;
class MaxScoreRemoveSubstring{
    public static int maxscore(String s,int x,int y){
        if(x>y)
        return removechar(s,"ab",x,"ba",y);
        else
        return removechar(s,"ba",y,"ab",x);
    }
    
    public static int removechar(String s,String high,int highscore,String low,int lowscore){
        
        StringBuilder temp=new StringBuilder();
        int totscore=0;
        
        for(char ch:s.toCharArray()){
            temp.append(ch);
            int len=temp.length();
            
            if(len>=2 && temp.substring(len-2).equals(high)){
                temp.delete(len-2,len);
                totscore+=highscore;
            }
        }
        
        StringBuilder fin=new StringBuilder();
        
        for(char ch:temp.toString().toCharArray()){
            fin.append(ch);
            int len=fin.length();
            
            if(len>=2 && fin.substring(len-2).equals(low)){
                fin.delete(len-2,len);
                totscore+=lowscore;
            }
        }
    
    return totscore;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.print(maxscore(s,x,y));

        sc.close();
    }
}