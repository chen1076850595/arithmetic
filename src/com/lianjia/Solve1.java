package com.lianjia;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/19.
 */
public class Solve1 {
    public static void main(String args[])
    {
        //获取数值
        Scanner cin = new Scanner(System.in);
        int line = 2;
        int appleHight[] = new int[10];
        int h = 0;
        while (cin.hasNextLine()){
            if(line == 0){
                break;
            }
            if(line == 1){
                h = cin.nextInt();
            }
            if(line == 2){
                for(int i= 0 ; i<10;i++){
                    appleHight[i] = cin.nextInt();
                }
            }
            line--;
        }
        //计算
        int output=0;
        h += 30;
        for(int i=0;i<10;i++){
            if(appleHight[i]<=h){
                output++;
            }
        }
        System.out.println(output);
    }
}
