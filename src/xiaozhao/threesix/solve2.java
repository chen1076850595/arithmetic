package xiaozhao.threesix;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/20.
 */
public class solve2 {
    //a为所有高度，q为区间
    public static int diffNum(long a[],int qu[]){
        int res = 0;
        int low = qu[0]-1;    //数组从0开始，故减一
        int high = qu[1]-1;
        if((high - low) < 2){
            return res;
        }
        int temp = 1;
        for(long i = low;i<high;i++){
            if(a[low] > a[low+1]){
                if(temp >= 3){
                    res =res + (temp - 2);
                    temp = 1;
                }
            }
            temp++;
        }
        if(temp >= 3){
            res = res +(temp - 2);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int out[][] = new int[m][2];
        for(int i=0;i<m;i++){
            out[i][0] = in.nextInt();
            out[i][1] = in.nextInt();
        }
        for(int i=0;i<m;i++){
            System.out.println(diffNum(a,out[i]));
        }
    }
}
