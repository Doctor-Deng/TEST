package day07;

import java.util.Random;
import java.util.Scanner;

/*
    题目要求：猜数字

    思路：
    1、首先产生一个随机数，并且一旦产生不再变化。
    2、需要键盘输入，所以用到了Scanner
    3、获取键盘输入的数字，用Scanner当中的nextInt方法
    4、如果输入的数字比随机数要大，就给出提示数字过大信息
    5、如果输入的数字比随机数要大，就给出提示数字过小信息
 */
public class Demo04Random {

    public static void main(String[] args) {
        ///产生一个随机数
        Random r = new Random();
        int ran = r.nextInt(100) + 1;   //不加1的时候，是0-99，在括号外加1了，就是0-100；在括号里加1，就是1-100
//        System.out.println(ran);

        System.out.println("游戏须知：你一共有三次机会猜数字！");
        System.out.println("随机数字范围是0-100");
        System.out.print("请输入一个0-100数字：");

        for (int i = 0; i < 3; i++) {
            //用键盘输入值
            Scanner s = new Scanner(System.in);
            int sca = s.nextInt();
            if (sca > ran){
                System.out.print("你猜的数字过大，请重新输入数字");
                System.out.print("请输入一个0-100数字：");
            }else if (sca < ran){
                System.out.print("你猜的数字过小，请重新输入数字");
                System.out.print("请输入一个0-100数字：");
            }else if(sca == ran){
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
