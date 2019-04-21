package day07;

import java.util.Scanner;

/*
    Scanner类的功能：实现键盘输入数据，到程序中

    引用类型的一般使用类型

  1、导包
  import 包路径，类名称
  如果需要使用的目标类，和当前类位于同一个包下，就可以省略导包语句不写
  只有java.long包下的内容不需要导包，其他的包都需要import

  2、创建
  类名称 对象名 = new 类名称（）；

  3、使用
  对象名.成员方法名（）

  获取键盘输入的一个int数字，int num = sc.nextInt();
  获取键盘输入的一个字符串，String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //System.in代表从键盘输入
        Scanner scanner = new Scanner(System.in);

        //获取键盘输入的int数字
        System.out.print("请输入数字：");
        int num = scanner.nextInt();
        System.out.println("输入的int数字是：" + num);

        //获取键盘输入的String字符串
        System.out.print("请输入字符串：");
        String string = scanner.next();
        System.out.println("输入的字符串是：" + string);

    }
}
