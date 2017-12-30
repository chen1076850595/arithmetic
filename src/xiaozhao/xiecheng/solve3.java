package xiaozhao.xiecheng;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/21.
 */
public class solve3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(in.nextInt(),1);
        }
        for(int i=1;i<=n+1;i++){
            if(!map.containsKey(i)){
                System.out.println(i);
                break;
            }
        }
    }
}
