package com.pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chen on 2017/8/11.
 */
public class Solution1 {
    //获得输入的不定长数组
    public static float [] input(){
        Scanner s = new Scanner(System.in);
        String inputs = s.nextLine();
        String input[] = inputs.split(" ");
        ArrayList<Float> arrayList = new ArrayList<>();
        for(String in : input) {
            arrayList.add(Float.parseFloat(in));
        }
        float inputss[] = new float[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            inputss[i] = arrayList.get(i);
        }
        return inputss;
    }
    public static float[] getArray(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        float array[] = new float[n];
        for(int i=0 ;i<n;i++){
            array[i] = s.nextInt();
        }
        return array;

    }

    //需要返回最大的乘积
    public static void solve(float A[]){
        if(A.length<3){
            System.out.println(0);
            return ;
        }
        if(A.length == 3){
            System.out.println( A[0]*A[1]*A[2]);
            return ;
        }
        float result; //最终结果
        float max[] = new float[3];   // 最大的三个正数
        float min[] = new float[2];   //最小的两个负数
        //初始化
        for(int i=0;i<3;i++){
            max[i] = 0;
            if(i<2){
                min[i] = 0;
            }
        }
        //时间复杂度为O(N)
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                for(int j=2;j>=0;j--){
                    if(A[i]>max[j]){
                        for(int k=0;k<j;k++){
                            max[k] = max[k+1];
                        }
                        max[j] = A[i];
                        break;
                    }
                }
            }
            else if(A[i]<0){
                for(int j=1;j>=0;j--){
                    if(A[i]<min[j]){
                        for(int k=0;k<j;k++){
                            min[k] = min[k+1];
                        }
                        min[j] = A[i];
                        break;
                    }
                }
            }
        }
        float result1 = max[0]*max[1]*max[2];
        float result2 = min[0]*min[1]*max[2];
        if(result1>result2){
            result = result1;
        }
        else{
            result = result2;
        }
        for(int i = 0;i<3;i++){
            System.out.println(max[i]);
            if(i<2){
                System.out.println(min[i]);
            }
        }
        System.out.println(result);
    }

    public static void main(String args[]){
       float A[] = getArray();
       solve(A);

    }

}

