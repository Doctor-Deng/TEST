package MathWork;

import java.util.Scanner;

/*
    判断回文字符串。如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon。
 */
public class Test07 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串（判断是否为回文: ");
        //利用键盘输入
        Scanner scanner = new Scanner(System.in);
        //用string记录输入的值
        String string = scanner.next();
        //将string的值传递给boolean方法
        boolean b = b(string);
        System.out.println("回文数：" + b);
    }

    //定义一个boolean方法，判断是否为回文
    public  static  boolean b (String string){
        //定义起始位置为0
        int start = 0;
        //定义string的终点位置
        int end = string.length()-1;
        //while循环string字符串，从0到尾
        while (start<end){
            //如果start 的值不等于 相对应的尾部值，返回false。 例如：12322  "1"与尾部的"2"对不上
            if (string.charAt(start) != string.charAt(end)){
                return false;
            }
            //例子：12321, "1" 与 "1" 判断成功，运行下面，下一次循环就对比"2" 与 "2"对比
            start++;
            end--;
        }
        return true;
    }
}
