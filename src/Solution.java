import java.util.Scanner;
import java.util.Stack;

/**
 * Created by machenike on 2017/6/6 0006.
 */
public class Solution {
    /**
     * 二叉树
     * 二叉树的生成
     * 二叉树的非递归遍历
     */
    static BinTree root = new BinTree(0);
    static int a=0;
    public static void changeA(int a){
        a ++;
    }
    //二叉树的生成

    public static void  createBinTree(BinTree root){

            System.out.println("请输入二叉树结点：");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a != -1&&root==null) {
                root = new BinTree(a);
            }
            else if(a!=-1&&root!=null){
                root.val = a;
            }
            else {
                root = null;
                return;
            }
            root.leftTree = new BinTree(0);
            createBinTree(root.leftTree);
            root.rightTree = new BinTree(0);
            createBinTree(root.rightTree);



    }
    //二叉树的非递归遍历
    /*前序遍历
    *  对于任一结点P：
     1)访问结点P，-并将结点P入栈;
     2)判断结点P的左孩子是否为空，若为空，则取栈顶结点并进行出栈操作，
       并将栈顶结点的右孩子置为当前的结点P，循环至1);若不为空，则将P的左孩子置为当前的结点P;
     3)直到P为NULL并且栈为空，则遍历结束
     */
    public static void preOrder(BinTree root){
        BinTree p = root;
        Stack<BinTree> stack = new Stack<BinTree>();
        System.out.println("二叉树的前序遍历：  ");
        while(p!=null||!stack.isEmpty()){
        while(p!=null){
            System.out.print(root.val+"  ");
            stack.push(p);
            p = p.leftTree;
        }
        p = stack.pop();
        p = p.rightTree;
        }
    }
    public static BinTree solution(BinTree root){
        BinTree root1 = root;
        return root1;
    }
    public static void main(String args[]){
        createBinTree(root);
        if(root == null){
          System.out.println("sorry , root is null");
       }else{
        preOrder(root);}

    }

}
