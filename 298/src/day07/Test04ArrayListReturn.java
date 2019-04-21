package day07;

import java.util.ArrayList;
import java.util.Random;

public class Test04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(100) + 1;//1-100
            list.add(r);
        }

        ArrayList<Integer> SmallList = getSmallList(list);
        System.out.println("偶数一共有多少个：" + SmallList.size());
        for (int i = 0; i < SmallList.size(); i++) {
            System.out.println(SmallList.get(i));
        }
    }
    //这个方法，接收大集合参数ArrayList<Integer> list，返回小集合结果smallList
    public static  ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        //创建一个小集合，用来装偶数的结果
        ArrayList<Integer> smallList = new ArrayList<>();
        //使用for循环遍历大集合的数组，利用判断语句循环出符合条件的小集合数字
        for (int i = 0; i < list.size(); i++) {
            int r = list.get(i);
            if (r % 2 == 0){
                smallList.add(r);
            }
        }
        return smallList;
    }
}

