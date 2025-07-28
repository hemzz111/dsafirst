package leetcode;

import java.util.Scanner;

public class CountHillsandValleys {
    public static int counthav(int nums[]){
        int count=0;

        for(int i=1;i<nums.length-1;i++){
            int left=i-1;
            int right=i+1;

            while(i<nums.length && nums[i]==nums[i+1]) i++;

            while(left>=0 && nums[left]==nums[i]) left--;

            while(right<nums.length && nums[right]==nums[i]) right++;

            if(left>=0 && right<nums.length){
                if(nums[left]<nums[i] && nums[right]<nums[i]) count++;

                if(nums[left]>nums[i] && nums[right]>nums[i]) count++;
        }
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int nums[]=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(counthav(nums));
        }
}
