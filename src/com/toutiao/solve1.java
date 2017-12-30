package com.toutiao;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/22.
 */
public class solve1 {
    //改进版冒泡排序
    public static int [][] bubbleSort(int a[][]){
        int exchange = a.length-1;
        for(int i = 0;i<a.length-1;++i){
            for(int j = 0;j<a.length-1-i;++j){
                if(a[j+1][0]<a[j][0]) {
                    int temp[][] = new int[1][2];
                    temp[0][0] = a[j][0];
                    temp[0][1] = a[j][1];
                    a[j][0] = a[j + 1][0];
                    a[j][1] = a[j+1][1];
                    a[j + 1][0] = temp[0][0];
                    a[j + 1][0] = temp[0][1];
                    exchange = a.length-j-1;
                }
            }
            i = exchange-1;
        }

        return a;
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int site[][] = new int[n][2];
        for(int i=0;i<n;i++){
            site[i][0] = cin.nextInt();
            site[i][1] = cin.nextInt();
        }
        bubbleSort(site);
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (site[i][1] < site[j][1]) {
                     flag = false;
                }
            }
            if(flag){
                System.out.println(site[i][0]+" "+site[i][1]);
            }
            flag = true;
        }
    }
}
