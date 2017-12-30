package xiaozhao.jindong;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/8.
 */
public class solve2 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n == 1){
            System.out.println(1);
        }
        if(n == 2){
            System.out.println(6);
        }
        int result = 0;
        for(int i =1;i<=n;i++){
            result += (i-1)*4+1;
        }
        System.out.println(result);
    }
}
