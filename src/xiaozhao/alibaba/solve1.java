//package xiaozhao.alibaba;
//import java.lang.reflect.Array;
//import java.util.HashMap;
//import java.util.Scanner;
//public class Main {
///** 请完成下面这个process函数，实现题目要求的功能 **/
//    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
//    private static int process()
//    {
//        //边界判断
//        if(items.length>=10){
//            return -1;
//        }
//        for(Model item:items){
//            if(item.price > 2000){
//                return -1;
//            }
//        }
//        int num = 0;    //返回数量
//        int length = boxTemplate.length;
//        int width = boxTemplate.width;
//        int height = boxTemplate.height;
//        int price = 2000 ;
//        HashMap<Integer,Integer> map = new HashMap<>(); //记录箱子是否被已被放入
//        for(int i=0;i<items.length && !map.containsKey(i);i++){
//            //该循环完毕完成一次装箱
//            for(int j = i+1;j<items.length && !map.containsKey(i);j++) {
//                if(items.price > price){
//                    continue;
//                }
//                //横着放
//               else if (items[i].height <= height && items[i].length <= length && items[i].width <= width) {
//                    length -= items[i] - length;
//                    width -= items[i] - width;
//                    height -= items[i] - height;
//                    price -= items[i].price;
//                    map.put(i,1);
//
//                } else if (items[i].height <= height && items[i].length <= width && items[i].width <= length) {
//                    length -= items[i] - length;
//                    width -= items[i] - height;
//                    height -= items[i] - width;
//                    price -= items[i].price;
//                    map.put(i,1);
//                }
//                //竖着放
//                else if (items[i].length <= height && items[i].width <= width && items[i].height <= length) {
//                    length -= items[i] - height;
//                    width -= items[i] - width;
//                    height -= items[i] - length;
//                    price -= items[i].price;
//                    map.put(i,1);
//                }
//                else if (items[i].length <= height && items[i].width <= length && items[i].height <= width) {
//                    length -= items[i] - height;
//                    width -= items[i] - length;
//                    height -= items[i] - width;
//                    price -= items[i].price;
//                    map.put(i,1);
//                }
//                //放不进去
//                else {
//                    continue;
//                }
//            }
//            //完成一次箱子的装入，拿一个新箱子
//             num ++;
//             length = boxTemplate.length;
//             width = boxTemplate.width;
//             height = boxTemplate.height;
//             price = 2000 ;
//
//
//        }
//
//    }
//    public static void main(String args[]){
//        Scanner scanner = new Scanner(System.in);
//        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;
//
//        while (scanner.hasNext()){
//            boxTemplate.length = scanner.nextInt();
//            boxTemplate.width = scanner.nextInt();
//            boxTemplate.height = scanner.nextInt();
//
//            int itemNum = scanner.nextInt();
//            items = new Model[itemNum];
//            for(int i=0; i<itemNum; i++){
//                Model item = new Model();
//                item.price = scanner.nextInt();
//                item.length = scanner.nextInt();
//                item.width = scanner.nextInt();
//                item.height = scanner.nextInt();
//                items[i] = item;
//            }
//            long startTime = System.currentTimeMillis();
//            boxMinNum = Integer.MAX_VALUE;
//            System.out.println (process());
//
//        }
//    }
//
//}
