package com.ali;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chen on 2017/8/15.
 */
public class solve1 {
    //获得输入的不定长数组  空格分隔
    public static int [] input(){
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
    public static void main(String args[]){
       int score [] = input();
       int sum = 0;   //总得分
        if(score.length == 1){
            System.out.println(score[0]);
            return ;
        }

        //加上第一个和最后一个的分
        if(score[0] != 0){
            if(score[1]!=0){
                sum += score[0]*score[1];
            }
            else {
                sum += score[0];
            }
        }
        if(score[score.length-1] != 0){
            if(score[score.length-2] != 0){
                sum += score[score.length-2]*score[score.length-1];
            }
            else {
                sum += score[score.length-1];
            }
        }
       //第一个和最后一个不遍历
       for(int i=1;i<score.length-1;i++){
           if(score[i-1]!=0 && score[i+1] != 0){
               sum += score[i-1]*score[i]*score[i+1];
           }
           else if(score[i-1] != 0){
               sum += score[i-1]*score[i];
           }
           else if(score[i+1] != 0){
               sum += score[i]*score[i+1];
           }
           else{
               sum += score[i];
           }
       }
       System.out.println(sum);


    }
}
