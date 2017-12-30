package xiaozhao.sougou;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/8.
 */
public class solve1 {
    //二分查找
    public static int binarySearch(int[] srcArray, int des){
        int low = 0;
        int high = srcArray.length-1;
        while(low <= high) {
            int middle = (low + high)/2;
            if(des == srcArray[middle]) {
                return middle;
            }else if(des <srcArray[middle]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        double arr[] = new double[n];
        for(int i=0;i<n;i++){
            arr[i] = cin.nextInt();
        }
        double maxLen = 0;
        for(int i=0;i<n;i++){
           double des = arr[i]+180;
            int low = i+1;
            int high = arr.length-1;
            while(low <= high) {
                int middle = (low + high)/2;
                if(des == arr[middle]) {
                    maxLen = 180;
                    break;
                }else if(des <arr[middle]) {
                    high = middle - 1;
                    if(high == low){
                        high++;
                        break;
                    }
                }else {
                    low = middle + 1;
                    if(high == low){
                        high++;
                        break;
                    }
                }
            }
            //double temp = Math.max()
        }
        System.out.println(String.format("%.8f",maxLen));
    }
}
