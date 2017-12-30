package xiaozhao.didixiaozhao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/10.
 */
public class solve1 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = cin.nextInt();
        }
         Arrays.sort(a);
        int k = 0;
        int temp = a[0];
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(a[i] == 0){
                k++;
            }
            else {
                if(a[i] > temp){
                    temp = a[i];
                    flag = true;
                }
                else if(a[i] == temp && flag){
                    k++;
                    flag = false;
                }
            }
        }
        System.out.println(k);

    }
}
