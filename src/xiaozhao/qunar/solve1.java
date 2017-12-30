package xiaozhao.qunar;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/26.
 */
public class solve1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int c[] = new int[6];
        for(int i=0;i<6;i++){
            c[i] = in.nextInt();
        }
        int a = in.nextInt();
        int num = 0;
        if(a == 0){
            System.out.println(num);
            return;
        }
        for(int i=5;i>=0;i--){
            while (c[i]>0 && a>0 ){
                if(i == 0){
                    if(a<1){
                        break;
                    }
                    a -= 1;
                    c[i] = c[i] - 1;
                    num++;
                }
                if(i == 1){
                    if(a<5){
                        break;
                    }
                    a -= 5;
                    c[i] = c[i] - 1;
                    num++;
                }
                if(i == 2){
                    if(a<10){
                        break;
                    }
                    a -= 10;
                    c[i] = c[i] - 1;
                    num++;
                }
                if(i == 3){
                    if(a<50){
                        break;
                    }
                    a -= 50;
                    c[i] = c[i] - 1;
                    num++;
                }
                if(i == 4){
                    if(a<100){
                        break;
                    }
                    a -= 100;
                    c[i] = c[i] - 1;
                    num++;
                }
                if(i == 5){
                    if(a<500){
                        break;
                    }
                    a -= 500;
                    c[i] = c[i] - 1;
                    num++;
                }
               // a -= c[i]
            }
        }
        if(a > 0){
            System.out.println("NOWAY");
        }
        else{
            System.out.println(num);
        }
    }
}
