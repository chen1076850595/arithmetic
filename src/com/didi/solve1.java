package com.didi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chen on 2017/8/26.
 */
public class solve1 {
    //获得输入的不定长数组
    public static int [] getInput(){
        Scanner s = new Scanner(System.in);
        String inputs = s.nextLine();
        String input[] = inputs.split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(String in : input) {
            arrayList.add(Integer.parseInt(in));
        }
        int inputss[] = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            inputss[i] = arrayList.get(i);
        }
        return inputss;
    }
    //时间复杂度  O(n)
    public static int maxSum(int[] array) {
        if(array.length == 1){
            return array[0];
        }
        int result = 0;   //用于保存最大和
        int s = 0;
        int max = 0;     //数列全为负数情况或仅有一个正数，返回最大值
        for(int i=0;i<array.length;i++){
            s += array[i];
            if(max<array[i]){
                max = array[i];
            }
            if(s<0){
                s = 0;
            }
            else if(s > result){
                result = s;
            }
        }
        if(result == 0){
            return max;
        }
        else {
            return result;
        }

             }
    public static void main(String[] args) {

        int array[] = getInput();
        System.out.print(maxSum(array));
    }
}
