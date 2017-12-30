package xiaozhao.aiqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by chen on 2017/9/10.
 */
public class solve2 {
    public static int res(String s){
        if(s.length() == 0){
            return 0;
        }
        char[] c = s.toCharArray();
        int maxLen = 0;
        int tempLen = 0;
        for(int i=0;i<c.length;i++){
            if(c[i] == '('){
                tempLen++;
            }
            else{
                maxLen = Math.max(maxLen,tempLen);
                tempLen = 0;
            }
        }
        return maxLen;

    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int max = res(s);
        System.out.println(max);
    }
}
