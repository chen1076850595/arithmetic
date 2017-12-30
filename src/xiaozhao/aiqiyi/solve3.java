package xiaozhao.aiqiyi;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/10.
 */
public class solve3 {
    public static boolean judge(int n,int m){
        double a = Math.sqrt(n*m);
        boolean res = isIntegerForDouble(a);
        return res;
    }
    //判断是否为整数
    public static boolean isIntegerForDouble(double a) {
        double eps = 1e-10;

        double b =a- Math.round(a);

        return Math.abs(b) < eps;
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == j){
                    count++;
                    continue;
                }
                boolean r = judge(i,j);
                if(r){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
