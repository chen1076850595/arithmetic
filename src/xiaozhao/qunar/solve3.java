package xiaozhao.qunar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by chen on 2017/9/26.
 */
class Node{
    String key;
    Node next = null;
    public Node(String str){
        this.key = str;
    }
    public String getKey(){
        return this.key;
    }
}
public class solve3 {
    private static Node head = null;
    private static Node last = head;
    private static HashMap<String ,String > map = new HashMap<>();
    private static int len = 0;
    public static void zhixing(String s,int maxLen){
        String str[] = s.split(" ");
        if(maxLen == 0){
            System.out.println("null");

        }
        else if(str[0].equals("put")){
            Node node = new Node(str[1]);
            if(len == 0){
                head = node;
                last = node;
                len++;
            }
            else if(len == maxLen){
                node.next = head.next;
                head = node;
                map.put(str[1],str[2]);
            }
            else {
                last.next = node;
                last = node;
                map.put(str[1],str[2]);
                len++;
            }
        }
        else if(str[0].equals("get")){
            if(len == 0){
                System.out.println("null");
            }
            else{
                Node ss = head;
                Node pre = null;
                while(ss!=null){
                    if(str[1].equals(ss.getKey())){
                        if(!last.getKey().equals(ss.getKey())) {
                            if(pre == null){
                                head = head.next;
                            }else {
                                pre.next = ss.next;
                            }
                            last.next = ss;
                            ss.next = null;
                        }
                        System.out.println(map.get(str[1]));
                        return ;
                    }
                    pre = ss;
                    ss = ss.next;
                }
                System.out.println("null");
            }
        }
    }


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i=0;i<n+1;i++){
            String minling = in.nextLine();
            zhixing(minling,m);
        }
    }
}
