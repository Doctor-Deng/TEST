package day07;

import java.util.ArrayList;

public class Test03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("谢广坤");
        list.add("李大坤");
        list.add("大黄蜂");
        System.out.println(list);   //[蔡徐坤，谢广坤，李大坤，大黄蜂]

        printArrayList(list);
    }

    /*
          方法的三要素
          返回值类型：只是进行打印而已，没有运算，没有结果，所以用void
          方法名称：printArrayList
          参数列表：ArrayList
     */

    public static void printArrayList(ArrayList<String> list) {
        // {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1){
                System.out.println(name + "}");
            }else {
                System.out.print(name + "@");
            }
        }
    }
}
