package xiaozhao.meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/14.
 */
public class solve2 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int light[] = new int[n];
        for(int i=0;i<n;i++){
            light[i] = cin.nextInt();
        }
        if(n == 1){
            if(light[0] == 1){
                System.out.println("Alice");
            }
            else if(light[0] == 0){
                System.out.println("Bob");
            }
            return;
        }
        System.out.println("Alice");

    }
}
