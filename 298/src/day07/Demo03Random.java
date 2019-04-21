package day07;

import java.util.Random;
import java.util.Scanner;
/*
    题目要求：
    根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n。

    思路：
    1、定义一个int变量n，随意赋值
    2、使用Random类，三个步骤，导包、创建、使用
    3、如果写10，那么就是0-9，然而想要的是1-10，可以发现，整体加1即可
 */
public class Demo03Random {

    public static void main(String[] args) {
/*
        根据键盘输入的值，确定随机数范围，0-n
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num =r.nextInt(n);
            System.out.println(num);
        }
*/
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int result =  r.nextInt(n) + 1;   //本来范围是0-5，
            System.out.println(result);
        }
    }
}
