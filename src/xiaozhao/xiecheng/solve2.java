package xiaozhao.xiecheng;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/21.
 */
public class solve2 {
    public static StringBuilder change(String s){
        StringBuilder res = new StringBuilder();
        char c[] = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(c[i] == ' '){
                res.append(c[i]);
            }
            else if(!map.containsKey(c[i])){
                map.put(c[i],1);
                res.append(c[i]);
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(change(str));
    }
}
