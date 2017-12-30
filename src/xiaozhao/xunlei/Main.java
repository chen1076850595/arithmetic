package xiaozhao.xunlei;
import java.util.Scanner;

public class Main {
    static class Solution {
        public static String solveEquation(String equation) {
            char eq[] = equation.toCharArray();
            int xishu = 0;
            int chang = 0;
            boolean flag = false;
            for(int i=0;i<eq.length;i++){
                //遇到等号
                if(eq[i] == '='){
                    flag = true;
                }
                //等式左边处理
                if(!flag){
                if(eq[i] == '+' || eq[i] == '-'){
                    if(eq[i-1] == 'x'){
                        if(i>1 && eq[i-2] !='+' && eq[i-2] != '-' ){
                            int temp = eq[i-2];
                            if(i==2 || (i>2 && eq[i-3] == '+')){
                                xishu += temp;
                            }
                            else {
                                xishu -= temp;
                            }
                        }
                        else if(i == 1 || (i>2 && eq[i-2] == '+')){
                            xishu++;
                        }
                        else{
                            xishu--;
                        }
                    }
                    else{
                        int temp = eq[i-1];
                        if((i > 1 && eq[i-2] == '+') || i == 1) {
                            chang -= temp;
                        }
                        else{
                            chang += temp;
                        }
                    }
                }
                }
                //等式右边处理
                else{
                    if(eq[i] == '+' || eq[i] == '-'){
                        if(eq[i-1] == 'x'){
                            if(eq[i-2]!= '=' && eq[i-2] !='+' && eq[i-2] != '-' ){
                                int temp = eq[i-2];
                                if(eq[i-3] == '=' || eq[i-3] == '+'){
                                xishu -= temp;
                                }
                                else {
                                    xishu += temp;
                                }
                            }
                            else if(eq[i-2] == '=' || eq[i-2] == '+'){
                                xishu--;
                            }
                            else{
                                xishu ++;
                            }
                        }
                        else{
                            int temp = eq[i-1];
                            if(eq[i-2] == '+' || eq[i-2] == '=') {
                                chang += temp;
                            }
                            else{
                                chang -= temp;
                            }
                        }
                    }

                }
            }
            //计算最后一个
            int len = eq.length;
            if(eq[len -1] == 'x'){
                if(eq[len - 2] != '+' && eq[len - 2] != '-' && eq[len - 2] != '='){
                    int temp = eq[len-2];
                    if(eq[len - 3] == '+' || eq[len - 3] == '='){
                        xishu -= temp;
                    }else{
                        xishu += temp;
                    }
                }
               else if(eq[len - 2] == '=' || eq[len - 2] == '+'){
                    xishu --;
                }
                else{
                   xishu++;
                }
            }
            if(xishu == 0 && chang==0){
                return "Infinite solutions";
            }
            else if(xishu == 0 && chang != 0){
                return "No solution";
            }
            int res = chang/xishu;
            return "x="+res;


            // 例如：equation = "2x+5-3+x=6+x-2";
            // return "Infinite solutions"; // 无穷解
            // return "No solution"; // 无解
            //return "x=1"; // 有解
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Solution.solveEquation(in.nextLine()));
    }
}
