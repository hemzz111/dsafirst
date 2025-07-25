package gfg;

import java.util.Scanner;

public class LastMomentAntfall {
    public static int lastmoment(int n,int left[],int right[]){
        int lmax=0;
        int rmax=0;

        for(int i:left)
        lmax=Math.max(lmax,i);

        for(int i:right)
        rmax=Math.max(rmax,n-i);

        return Math.max(lmax,rmax);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int l=sc.nextInt();
        int left[]=new int[l];

        for(int i=0;i<l;i++) 
        left[i]=sc.nextInt();

        int r=sc.nextInt();
        int right[]=new int[r];

        for(int i=0;i<r;i++)
        right[i]=sc.nextInt();

        sc.close();
        
        System.out.print(lastmoment(n, left, right));
    }
}
