package xiaozhao.aiqiyi;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/10.
 */
public class solve1 {
    //public static String
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int x1 = cin.nextInt();
        int k1 = cin.nextInt();
        int x2 = cin.nextInt();
        int k2 = cin.nextInt();
        String num1 = String.valueOf(x1);
        String num2 = String.valueOf(x2);
        int len1 = num1.length() * k1;
        int len2 = num2.length() * k2;
        //System.out.println(len1);
        if(len1 < len2){
            System.out.println("Less");
        }
        else if(len1 > len2){
            System.out.println("Greater");
        }
        else{
            int max ;
            if(num1.length() < num2.length()){
                String temp = num1;
                max = num2.length();
                for(int i=0;i<(num2.length()/num1.length())+1;i++){
                    num1 +=  temp;
                }
            }
            else if(num1.length() > num2.length()){
                String temp = num2;
                max = num2.length();
                for(int i=0;i<(num1.length()/num2.length())+1;i++){
                    num2 += temp;
                }
            }
            else{
                max = num1.length();
            }
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(max);

            for(int i=0;i<max;i++){

                if(Integer.valueOf(num1.substring(i,i+1)) < Integer.valueOf(num2.substring(i,i+1))){
                    System.out.println("Less");
                    return;
                    //break;
                }
                else  if(Integer.valueOf(num1.substring(i,i+1)) > Integer.valueOf(num2.substring(i,i+1))){
                    System.out.println("Greater");
                    return;
                }
            }
            System.out.println("Equal");
        }
    }
}
