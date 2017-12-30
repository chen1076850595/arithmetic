package com.lianjia;

import java.util.*;

/**
 * Created by chen on 2017/8/19.
 */
public class Solve3 {
    //去重
    public static List noRepeat(int input[]){
        List list = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i<input.length;i++){
             map.put(input[i],1);
        }
        for (Integer key : map.keySet()) {
                list.add(key);
        }

        return list;
    }
    public static int[] sort(List array){
        int result[] = new int[array.size()];
        for(int i=0;i<array.size();i++){
            result[i] = (int) array.get(i);
        }
        //改进版冒泡排序
        int exchange = result.length-1;
        for(int i = 0;i<result.length-1;++i){
            for(int j = 0;j<result.length-1-i;++j){
                if(result[j+1]<result[j]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    exchange = result.length-j-1;
                }
            }
            i = exchange-1;
        }

        return result;
    }
    public static void main(String args[]){
        //获得输入
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int input[] = new int[n];
        for(int i=0;i<n;i++){
            input[i] = cin.nextInt();
        }
        int output[];

        output = sort(noRepeat(input));
        System.out.println(output.length);
        for(int i =0; i< output.length-1; i++){

            System.out.print(output[i]+" ");
        }
        System.out.print(output[output.length-1]);

    }
}
