package xiaozhao.zhaohangxinyongka;

import java.util.Scanner;

/**
 * Created by chen on 2017/9/21.
 */
public class solve2 {
    public static int judge(String p){
        int res = 0;
        char pass[] = p.toCharArray();
        int len = pass.length;
        int type = 0;     //最大为3
        int delnum = 0;      //记录可以用删除纠正的字母
        int updatenum = 0;   //记录必须修改纠正的字母
        boolean upperFlag = true;
        boolean lowerFlag = true;
        boolean numFlag = true;
        int temp = 1;
        for(int i=0;i<len;i++){
            if(upperFlag && Character.isUpperCase(pass[i])){
                type ++ ;
                upperFlag = false;
            }
            if(lowerFlag && Character.isLowerCase(pass[i])){
                type ++;
                lowerFlag = false;
            }
            if(numFlag && 0<pass[i] && pass[i] <9 ){
                type ++;
                numFlag = false;
            }
            if(i>0){
                if(pass[i] != pass[i-1]){
                    if(temp == 3){
                        delnum++;
                    }
                    else {
                        updatenum += temp/3;
                    }
                    temp = 1;
                    continue;
                }
                temp ++ ;
            }
        }
        if(updatenum > 5){
            updatenum = 6;
        }
        if( len >= 25 ){
            res = 6 + Math.max(updatenum,type-3) ;
        }
        else if(20 < len && len < 25){
            if(updatenum > delnum){
                res = (len - 20) +Math.max(updatenum,type-3);
            }
            else{
                res = Math.max(delnum,len-20) + Math.max(updatenum,type-3);
            }
        }
        else if(6<= len && len <= 20){
            res = Math.max(updatenum,type-3) + delnum;
        }
        else {
            res = Math.max(type-3,6-len);
        }

       // Character.isUpperCase(char c);
        //Character.isLowerCase(char c)
        return res;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        System.out.println(judge(password));
    }
}
