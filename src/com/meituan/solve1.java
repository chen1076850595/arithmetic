package com.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chen on 2017/8/31.
 */
public class solve1 {
    // 非递归实现

    public static int max(int[] array , int n){
        int maxSum = 0;
        int max = 0;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i ; j < array.length;j++){
                int curSum = 0;
                for (int k = i; k <= j; k++){
                    curSum += array[k];
                    if(curSum%n==0 && curSum > maxSum ){
                        maxSum = curSum;
                        max = k-i+1;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
        }
        int k = cin.nextInt();
        System.out.println(max(a,k));

    }
}
