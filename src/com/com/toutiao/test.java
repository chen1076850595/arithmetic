package com.com.toutiao;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/22.
 */
public class test {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()){

            int n = cin.nextInt();
            int m = cin.nextInt();
            double sum = n;
            double lastNum = n;
            for(int i=1;i<m;i++){
                lastNum = Math.sqrt(lastNum);
                sum += lastNum;
            }
            System.out.print(String.format("%.2f ",sum));
        }
    }
}
