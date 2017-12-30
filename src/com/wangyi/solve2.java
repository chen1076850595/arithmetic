package com.wangyi;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/12.
 */
public class solve2 {
    public static void main(String args[]){
        //获得输入数据
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(int i =0;i<n;i++){
            x[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            y[i] = sc.nextInt();
        }

        int ans[] = new int[n];   //输出结果
        int  mat[][] = new int[n][n];
        if(n==1){
            System.out.println("0");
            return ;
        }

    }
}
