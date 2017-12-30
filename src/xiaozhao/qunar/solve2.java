package xiaozhao.qunar;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/26.
 */
public class solve2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int weight[] = new int[n];
        int st[][] = new int[e][2];
        for(int i=0;i<n;i++){
            weight[i] = in.nextInt();
        }
        for(int i=0;i<e;i++){
            st[i][0] = in.nextInt();
            st[i][1] = in.nextInt();
        }

    }
}
