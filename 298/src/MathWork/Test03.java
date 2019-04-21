package MathWork;

import java.util.Scanner;
/*
    题目：字符串查找。
        - 键盘录入一个大字符串，再录入一个小字符串。
        - 统计小字符串在大字符串中出现的次数。
  * 分析以下需求，并用代码实现
  1.键盘录入一个大字符串,再录入一个小字符串
  2.统计小字符串在大字符串中出现的次数
  3.代码运行打印格式:
  请输入大字符串:
  请输入小字符串:
  控制台输出:小字符串"",在大字符串""中共出现3次
          */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入大字符串：");
        String BigScanner = scanner.next();
        System.out.print("请输入小字符串：");
        String SmallerScanner = scanner.next();
        int count = conut(BigScanner,SmallerScanner);
        System.out.println("小字符串" +
                SmallerScanner + ",在大字符串中共出现" + count + "次");
    }
/*
    indexOf（String str , int fromIndex）
    该方法的意思是：从fromIndex位置开始查找，
    字符串str第一次出现的位置，若没找到，返回-1。
 */
    public static int conut(String BigScanner,String Smallcanner){
        int index = 0;
        int count = 0;
        while ((index = BigScanner.indexOf(Smallcanner,index)) != -1){
            index++;    //第一次从大字符串的位置0开始，没找到，就从1开始，while循环
            count++;
        }
        return count;
    }
}
