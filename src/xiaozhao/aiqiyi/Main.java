
package xiaozhao.aiqiyi;

import java.util.Scanner;


public class Main{
    public static boolean isIntegerForDouble(double a) {
        double eps = 1e-10;

        double b =a- Math.round(a);

        return Math.abs(b) < eps;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                double sum=0,sum2=0;
                sum = Math.sqrt(i)+Math.sqrt(j);
                sum2 = sum*sum;

                if(isIntegerForDouble(sum2))
                {
                    count++;

                }
                else {
                    continue;
                }

            }

        }

        System.out.println(count);

    }


}
