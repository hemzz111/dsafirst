package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MajorityElementII {
    public static List<Integer>majority(int arr[]){

        int n=arr.length;
        int ele1=0,ele2=0;
        int cnt1=0,cnt2=0;

        for(int ele:arr){
            if(ele1==ele) cnt1++;

            else if(ele2==ele) cnt2++;

            else if(cnt1==0) {
                ele1=ele;
                cnt1++;
            }
            else if(cnt2==0){
                ele2=ele;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer>res=new ArrayList<>();
        cnt1=0;
        cnt2=0;

        for(int ele:arr){
            if(ele==ele1) cnt1++;
            if(ele==ele2) cnt2++;
        }
        if(cnt1>n/3) res.add(ele1);
        if(cnt2>n/3 && ele1!=ele2) res.add(ele2);

        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the element of the array: ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        List<Integer>res=majority(arr);
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
