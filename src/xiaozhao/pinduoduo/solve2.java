package xiaozhao.pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/2.
 */
class Tree{
    String value;
    List<Tree> next;
    public Tree(String v){
        this.value = v;
    }
}
public class solve2 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<n;i++){
            list.add(cin.nextLine());
        }
        Tree root =null;
        for(int i=0;i<n;i++){
            if(Integer.valueOf(list.get(i).split(" ")[1]) == -1){
                 root = new Tree(list.get(i).split(" ")[0]);
            }
        }

        for(int i=0;i<n;i++){
            int flag = Integer.valueOf(list.get(i).split(" ")[1]);
            if(flag == -1){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(Integer.valueOf(list.get(j).split(" ")[1])>flag){
                    Tree s = new Tree(list.get(j));
                    root.next.add(s);
                }
            }
        }
    }

}
