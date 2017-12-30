package com.wangyi;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/12.
 */
public class solve3 {
   private static long  ans = 0;
   private static  int flag = 1;
    public static void twoNum(int oneNum,int k,int n){
        flag++;
        if(flag>n){
            ans++;
            flag--;
            return ;
        }
        for(int i=1;i<oneNum;i++){
            if( oneNum % i != 0){

                twoNum(i,k,n);
            }
        }
        flag--;
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=1;i<=k;i++){
            twoNum(i,k,n);
        }
        System.out.println((ans%1000000007));
    }
}
