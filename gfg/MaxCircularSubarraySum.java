package gfg;

import java.util.Scanner;

public class MaxCircularSubarraySum {
    public static int subarray(int arr[]){
        int totalsum=0;
        int curmaxsum=0,curminsum=0;
        int maxsum=arr[0],minsum=arr[0];

        for(int i=0;i<arr.length;i++){

            curmaxsum=Math.max(curmaxsum+arr[i],arr[i]);
            maxsum=Math.max(curmaxsum,maxsum);

            curminsum=Math.min(curminsum+arr[i],arr[i]);
            minsum=Math.min(curminsum,minsum);

            totalsum+=arr[i];

        }
        int normalsum=maxsum;
        int circlesum=totalsum-minsum;

        if(minsum==totalsum)
        return normalsum;

        return Math.max(normalsum,circlesum);
    }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            int arr[]=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            sc.close();
            System.out.print(subarray(arr));
        }
}
