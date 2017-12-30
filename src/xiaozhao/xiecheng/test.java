package xiaozhao.xiecheng;

/**
 * Created by chen on 2017/9/21.
 */
public class test {
    public static void main(String args[]){
        String str = "hello world a";
        StringBuilder sb = new StringBuilder();
        char c[] = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] == ' '){
                sb.append(new String(c[i]+"1"));
            }
        }
        System.out.println(sb);
    }
}
