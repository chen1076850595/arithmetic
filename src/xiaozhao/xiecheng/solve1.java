package xiaozhao.xiecheng;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/21.
 */
public class solve1 {
    public static void findMid(int a1[],int n,int a2[],int m){
        int i=0;    //a1下标
        int j=0;    //a2下标
        ArrayList<Integer> list = new ArrayList<>((n+m)*2);
        while(i<n && j<m){
            if(a1[i] < a2[j]){
                list.add(a1[i]);
                ++i;
            }
            else if(a1[i] > a2[j]){
                list.add(a2[j]);
                ++j;
            }
            else{
                list.add(a1[i]);
                ++i;
                ++j;
            }
        }
        if(i == n && j<m){
            for(int k = j;k<m;k++){
                list.add(a2[k]);
            }
        }
        if(j == m && i<n){
            for(int k = i;k<n;k++){
                list.add(a1[k]);
            }
        }
        int size = list.size();
        if(size % 2 == 1){
            float mid = 0;
            mid = list.get(size/2);
            //System.out.println(mid);
            System.out.println(String.format("%.1f",mid));
        }
        else{
            float mid =0;
            float one = list.get(size/2);
            float two = list.get(size/2-1);
            mid = (one+two)/2;
            System.out.println(String.format("%.1f",mid));

        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a1[] = new int[n];
        for(int i=0;i<n;i++){
            a1[i] = in.nextInt();
        }
        int m = in.nextInt();
        int a2[] = new int[m];
        for(int i=0;i<m;i++){
            a2[i] = in.nextInt();
        }
        findMid(a1,n,a2,m);
    }
}
