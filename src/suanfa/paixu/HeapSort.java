package suanfa.paixu;

/**
 * Created by chen on 2017/8/30.
 * 堆排序
 */
//堆排序，首先需要堆化数组，堆的根结点为a[0]，a[n]的左子结点为2n+1,右子结点为2n+2，父结点为(n-1)/2
public class HeapSort {
    //插入后重新调整堆
    public int[] HeadFixup(int a[],int i){
        int temp = a[i];
        while(i != 0 && temp < a[(i-1)/2]){
            a[i] = a[(i-1)/2];
            i = (i-1)/2;
        }
        a[i] = temp;
        return a;
    }
    //插入操作，元素放在堆的最后面,然后重新调整堆
    public void addNum(int a[],int n ,int num){
        a[n] = num;
        a = HeadFixup(a,n);
    }
    //删除后重新调整堆,n为结点总数
    public int[] HeapFixdown(int a[],int i,int n){
        int temp = a[i];
        int j =2*i+1;
        while(j < n ) {
            if ((j+1)<n && a[j] > a[j+1]) {
               j++;
            }
            if (temp <= a[j]) {
                break;
            }
            a[i] = a[j];
            i = j;
            j = 2*i+1;
        }
        return a;
    }
    //删除堆元素
    public void delNum(int a[],int n){
        a[0] = a[n];
        a = HeapFixdown(a,0,n);
    }
    //建堆
    public int[] creatHeap(int a[],int n){
        for (int i = n / 2 - 1; i >= 0; i--)
            HeapFixdown(a, i, n);
        return a;
    }

}
