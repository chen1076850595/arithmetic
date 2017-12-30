package com.meituan;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/31.
 */
public class solve2 {
    public static String find(int a[]){
        int max = a[0];
        int sum = 0;
        String res;
        for(int i=0;i<a.length;i++){
            if(a[i] >= max){
                max = a[i];
            }
            else{
                sum+=a[i];
            }
        }
        if(sum<=max){
           res = new String("YES");
        }
        else{
            res = new String("NO");
        }
        return res;
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
        }
        if(n == 1){
            System.out.println("NO");
        }
        else{
            System.out.println(find(a));
        }
    }
}
