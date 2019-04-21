package APIWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int zhi = scanner.nextInt();
            list.add(zhi);
        }

        //替换前的数组元素
        for (int i = 0; i < list.size(); i++) {
            if (i==0){
                System.out.print("替换前:[" + list.get(i) + ",");
            }else if (i<list.size() && i > 0) {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");


        System.out.println("72的索引是：" + findIndex(list,72));
        System.out.println("==========================");
        replace(list,72,27);

        //替换后的数组元素
        for (int i = 0; i < list.size(); i++) {
            if (i==0){
                System.out.print("替换后:[" + list.get(i) + ",");
            }else if (i < list.size() && i > 0){
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");

    }

    //该方法的用处是，找出数组集合中，元素 第一次 出现的位置。
    public static int findIndex(List<Integer> list,int i){
        ArrayList<Integer> listTest = new ArrayList<>();
        int index = -1;
        //遍历list数组
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == i) {
                index = j;
                listTest.add(index);
            }
        }
        System.out.println(i + "在list数组集合中出现的次数是：" + listTest.size() + "次");
        for (int aa = 0; aa < listTest.size(); aa++) {
            System.out.println(i + "在list数组集合中出现的位置是: " + list.get(aa) + "号元素");
        }
        return index;

    }

    //将newValue的值给oldValue
    public static void replace(List<Integer> list, Integer oldValue, Integer newValue){
        //遍历数组集合
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) {
                list.set(i, newValue);      //将newValue的值设置给i
            }
        }
    }
}

