package xiaozhao.xunlei;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/19.
 */
public class solve1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(m>(n+n*n)/2){
           System.out.println(0);
           return;
        }
    }

}
