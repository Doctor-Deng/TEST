package day07;

import java.util.Scanner;
/*
    键盘输入两个值，输出为两个数相加的结果
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int b = scanner.nextInt();
        System.out.print("两个数相加结果为：");
        System.out.println(a+b);
    }
}
