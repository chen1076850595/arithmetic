package xiaozhao.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/2.
 */
public class solve1 {
    //冒泡排序
    public static int [][] bubbleSort(int a[][]){

        for(int i = 0;i<a.length-1;++i){
            for(int j = 0;j<a.length-1-i;++j){
                if(a[j+1][0]>a[j][0]) {
                    int temp[] = new int[2];
                     temp[0]= a[j][0];
                     temp[1] =a[j][1];
                    a[j][0] = a[j + 1][0];
                    a[j][1] = a[j+1][1];
                    a[j + 1][0] = temp[0];
                    a[j + 1][1] = temp[1];

                }
            }

        }

        return a;
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();   //熊的数量
        int m = cin.nextInt();   //糖果的数量
        int candies[] = new int[m];
        for(int i=0;i<m;i++){
            candies[i] = cin.nextInt();
        }
        int xiong[][] = new int[n][2];
        for(int i = 0;i<n;i++){
            xiong[i][0] = cin.nextInt();
            xiong[i][1] = cin.nextInt();
        }
        Arrays.sort(candies);
        int xiong2[][] = xiong;
        xiong = bubbleSort(xiong);

        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){

                if(candies[j]!=0 && xiong[i][1]>=candies[j]){
                    xiong[i][1] -= candies[j];
                    candies[j] = 0;

                }

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(xiong[j][0] == xiong2[i][0]){
                    System.out.println(xiong[i][1]);
                    break;
                }
            }
        }
    }
}
