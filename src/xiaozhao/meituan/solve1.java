package xiaozhao.meituan;

import java.util.*;

/**
 * Created by chen on 2017/9/14.
 */
//拼接小于
public class solve1 {
    public  static int getNum(int arr[]){
        int total = 0;
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                String num1 = String.valueOf(arr[i])+String.valueOf(arr[j]);
                String num2 = String.valueOf(arr[j])+String.valueOf(arr[i]);
                if(Integer.parseInt(num1) % 7 == 0){
                    if(!map.containsKey(num1)){
                        map.put(num1,1);
                        total++;
                    }
                }
                if(Integer.parseInt(num2) % 7 == 0){
                    if(!map.containsKey(num2)){
                        map.put(num2,1);
                        total++;
                    }
                }
            }
        }
        return total;

    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
       // int arr[] = new int[n];
        ArrayList<Integer> arrayList = new ArrayList<>(1000);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(cin.nextInt());
        }
        for(int a:set){
            arrayList.add(a);
        }
        int arr[] = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            arr[i] = arrayList.get(i);
        }


        System.out.println(getNum(arr));
    }
}
