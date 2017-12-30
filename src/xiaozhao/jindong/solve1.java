package xiaozhao.jindong;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by chen on 2017/9/8.
 */
public class solve1 {
    private static int result = 0;
    //判断是否为合法括号队列
    public static boolean judge(String s) {
       boolean reslut = false;
        Stack<Character> sc=new Stack<Character>();
        char[] c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='(') {
                sc.push(c[i]);
            }
            else if (c[i]==')') {
                if (!sc.isEmpty() && sc.peek()=='(') {
                    sc.pop();
                }
            }
        }
        if (sc.empty()) {
            reslut = true;
        }
        return reslut;
    }
    public static void find(String s){
        if(s.length() == 2){
            result++;
            return;
        }
        s = s.substring(1,s.length());
        String tempString = s;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]==')'){
                //result++;
                String str1 = s.substring(0,i);
                String str2 = s.substring(i+1,s.length());
                tempString = str1 + str2;
                boolean j = judge(tempString);
                if(j){
                    //result++;
                    find(tempString);
                }
                //find(s);
            }
        }

    }

    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        boolean res = judge(s);
        if(!res){
            System.out.println(0);
            return;
        }
        find(s);
        System.out.println(result);

    }
}
