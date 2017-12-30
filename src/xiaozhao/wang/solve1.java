package xiaozhao.wang;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/9.
 */
public class solve1 {
     static boolean flag = false;
    public static void find(int num[],int temp,int j){
        int i=0;
      //  boolean res = false;
        num[j] = -2;
       while(num[i]!=-1){
           if(num[i]>0) {
               //flag = false;
               if ((num[i] * temp) % 4 == 0) {
                   temp = num[i];
                 //  flag++;
                   find(num,temp,i);
               }
           }

           ++i;
       }
       int f = 0;
        while(num[i]!=-1){
           if(num[i]!=-2){
               f++;
           }
        }
        if(f == 0){
            flag = true;
        }

       //return res;

    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int len = cin.nextInt();
        int num[][] = new int[len][100000];    //len个数列
        for(int i=0;i<len;i++){
            int n = cin.nextInt();
            for(int j=0;j<n;j++){
                num[i][j] = cin.nextInt();
            }
            num[i][n] = -1;
        }
        for(int i=0;i<len;i++){
             find(num[i],num[i][0],0);
            if(flag){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            flag = false;
        }
    }
}
