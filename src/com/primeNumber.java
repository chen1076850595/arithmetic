package com;

import java.util.Scanner;

/**
 * Created by chen on 2017/8/19.
 */
public class primeNumber {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;
        while(true){
            prime++;
            if(isPrime(prime)){
                n--;
                if(n == 0){
                    break;
                }
                System.out.println("第n个素数："+prime);
            }
        }
        System.out.println(prime);
    }
    public static boolean isPrime(int prime){

        for(int i = 2;i<=prime/2;i++){
            if(prime % i == 0){
                return false;
            }
        }
        return true;
    }
}
