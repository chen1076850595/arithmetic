package xiaozhao.didixiaozhao;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/10.
 */
//寻找丑数
public class solve2 {
    static int uglNum(int k) {

     int num[] = new int[k+1];
     num[0]=1;
     int num2 = 0;
     int num3 = 0;
     int num5 = 0;
        for(int i=1;i<=k;i++)
        {
            //   2 3 5 第K个丑数一定是前面的丑数乘以2  3  5 寻找最小即可
            num[i]=Math.min(Math.min(num[num2]*2,num[num3]*3),Math.min(num[num2]*2,num[num5]*5));
            if(num[i]==num[num2]*2) {
                num2++;
            }
            if(num[i]==num[num3]*3) {
                num3++;
            }
            if(num[i]==num[num5]*5) {
                num5++;
            }
        }
        return num[k-1];
    }
    public static void main(String args[]){
         Scanner cin = new Scanner(System.in);
         int n = cin.nextInt();
         System.out.println(uglNum(n));
    }
}
