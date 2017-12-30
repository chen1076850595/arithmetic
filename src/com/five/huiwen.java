package com.five;

/**
 * Created by chen on 2017/8/22.
 */
public class huiwen {
    public static void main(String args[]){
        String s = new String ("aba");
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            System.out.print(s.charAt(i));
        }
        String b = sb.toString();
        if(s.equals(b)){
            System.out.println("true");
        }
    }
}
