package com.alibaba;

/**
 * Created by chen on 2017/8/21.
 */
import java.util.*;
public class Pick {
/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int pick(int[] peaches) {
        int result = 0;
        int len = peaches.length;
        int num[] = new int[len];
        for(int i=0;i<len;i++){
            num[i] = 1;
        }
        for(int i=0;i<len-1;i++){
            int s = peaches[i];
            for(int j=i+1;j<len;j++){
                if(peaches[j] >= s){
                    s = peaches[j];
                    num[i]++;
                }
            }
        }
        for(int i=0;i<len;i++){
            if(num[i]>result){
                result = num[i];
            }
        }
        return  result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
}