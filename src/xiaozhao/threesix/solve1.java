package xiaozhao.threesix;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/20.
 */
public class solve1 {
    public static int maxT(int a[],int n,int t){
        int max = a[n-1];
        //使用二分查找找到最接近t的数
        int high = n-1;
        int low = 0;
        int mid = (low+high)/2;
        while(low < high){
            if(a[mid] < t){
                low = mid+1;
                mid = (low+high)/2;
            }
            else if(a[mid] > t){
                high = mid - 1;
                mid = (low+high)/2;
            }
            else {
                break;
            }
        }
        if(mid == (n-1)){
            mid--;
        }
        int maxTime = 0;
        for(int i=mid;i>=0;i--){
            if((maxTime+a[i]) < t) {
                maxTime += a[i];
            }
        }
        maxTime += max;
        return maxTime;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);

        System.out.println(maxT(a,n,t));
    }
}
