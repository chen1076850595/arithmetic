package com.wangyi;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/12.
 */
public class solve1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();   //房租
        int f = sc.nextInt();   //已拥有水果
        int d = sc.nextInt();   //已拥有资金
        int p = sc.nextInt();   //水果单价
        int maxDay = d/x;
        if(f>=maxDay){
            System.out.println(maxDay);
            return ;
        }
        int money = d - f * x ;
        int day = money / (x+p) ;
        System.out.println((day+f));
    }
}
