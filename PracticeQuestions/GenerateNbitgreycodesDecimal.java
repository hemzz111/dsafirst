package PracticeQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateNbitgreycodesDecimal{
    public static ArrayList<String>solve(int n){
        
        ArrayList<String>res=new ArrayList<>();
        if(n==0){
            res.add("0");
            return res;
        }
        if(n==1){
            res.add("0");
            res.add("1");
            return res;
        }
        ArrayList<String>temp=solve(n-1);

        for(int i=0;i<temp.size();i++)
        res.add("0"+temp.get(i));

        for(int i=temp.size()-1;i>=0;i--)
        res.add("1"+temp.get(i));

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        sc.close();
        ArrayList<String>binarycodes=solve(n);
        ArrayList<Integer>decimal=new ArrayList<>();

        for(String binary:binarycodes){
            decimal.add(Integer.parseInt(binary,2));
        }

        for(int res:decimal){
            System.out.print(res+" ");
        }
    }
}
