package xiaozhao.wang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by chen on 2017/9/9.
 */
public class solve3 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n <= 2 ){
            System.out.println(0);
            return;
        }
        int num[] = new int[n];
        for(int i=0;i<n;i++){
            num[i] = cin.nextInt();
        }
       Stack<Integer> list1 = new Stack<>();
        Stack<Integer> list2 = new Stack<>();
        list1.push(num[0]);
        list2.push(num[1]);
        int len = 0;
        for(int i=2;i<n;i++){
            //len = Math.abs((num[i] -list2.peek())) + Math.abs((num[i] -list1.peek()));
            if(Math.abs((num[i] -list2.peek())) > Math.abs((num[i] -list1.peek()))){
                list1.push(num[i]);
                len += Math.abs((num[i] -list1.peek()));
            }
            else {
                list2.push(num[i]);
                len += Math.abs((num[i] -list2.peek()));
            }
        }
        System.out.println(len);
    }
}
