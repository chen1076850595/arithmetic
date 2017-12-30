package com.lianjia;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/19.
 */
public class Solve2 {
    public static int[] getNum(int group[]){
        int num[] = new int[group.length];
        num[0] = group[0];
        for(int i=1;i<group.length;i++){
            num[i] = num[i-1]+group[i];
        }
        return num;
    }
    public static void main(String args[]){
        //Input
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int group[] = new int[n];
        for(int i=0;i<n;i++){
            group[i] = cin.nextInt();
        }
        int q = cin.nextInt();
        int question[] = new int[q];
        for(int i=0;i<q;i++){
            question[i] = cin.nextInt();
        }

        //逻辑
        int output[] = new int[q];
        int sum[] = getNum(group);
        for(int i=0;i<q;i++){
            for(int j=0;j<sum.length;j++){
                if(question[i]<=sum[j]){

                    System.out.println(j+1);
                    break;
                }
            }
        }

    }
}
