package xiaozhao.sougou;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/9.
 */
public class wang1 {
    public static void find(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int len = cin.nextInt();
        int num[][] = new int[len][Integer.MAX_VALUE];    //len个数列
        for(int i=0;i<len;i++){
            int n = cin.nextInt();
            for(int j=0;j<n;j++){
                num[i][j] = cin.nextInt();
            }
            num[i][n] = -1;
        }
        for(int i=0;i<len;i++){
            find(num[i]);
        }
    }
}
