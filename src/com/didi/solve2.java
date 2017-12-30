package com.didi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chen on 2017/8/26.
 */
public class solve2 {
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
    //冒泡排序
    public static int [] bubbleSort(int a[]){
        int exchange = a.length-1;
        for(int i = 0;i<a.length-1;++i){
            for(int j = 0;j<a.length-1-i;++j){
                if(a[j+1]<a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    exchange = a.length-j-1;
                }
            }
            i = exchange-1;
        }

        return a;
    }
    public static int getKMax(int array[],int k){
        if(array.length == 1){
            return array[0];
        }
        array = bubbleSort(array);
        return array[array.length-k];
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int array[] = getInput();
        int k = cin.nextInt();
        System.out.print(getKMax(array,k));
    }
}
