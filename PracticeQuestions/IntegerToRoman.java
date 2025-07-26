package PracticeQuestions;

import java.util.Scanner;

public class IntegerToRoman {

    public static String IntegertoRoman(int n){
        int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String rom[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        StringBuilder sb=new StringBuilder();

        for(int i=val.length-1;i>=0;i--){
            while(n>=val[i]){
                sb.append(rom[i]);
                n-=val[i];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer to convert to Roman: ");
        int n=sc.nextInt();
        sc.close();

        System.out.println(IntegertoRoman(n));
    }
}
