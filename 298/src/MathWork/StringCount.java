package MathWork;

import java.util.Scanner;

/*
    题目输入一个字符串，并且统计其中各种字符出现的次数
    种类有：大写字母，小写字母，数字，其他

    思路：
    1、键盘输入Scanner
    2、输入的是字符串，sc.next();
    3、要统计四种类型，就要用int变量去记录出现的次数
    4、需要对字符串一个一个检查，Stirng --> char[] 方法就是toCharArray()
    5、遍历char[]数组，对他们进行if判断分类，符合就变量++
    6、打印输出最后的结果，即四个变量
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = scanner.next();

        int countUpper = 0;     //大写字母
        int countLower = 0;     //小写字母
        int countnumber = 0;     //数字
        int countOther = 0;     //其他

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ('A' <= c && c <= 'Z'){
                countUpper++;
            }else if ('a' <= c && c <= 'z'){
                countLower++;
            }else if ('0' <= c && c <= '9'){
                countnumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母出现的次数是：" + countUpper);
        System.out.println("小写字母出现的次数是：" + countLower);
        System.out.println("数字出现的次数是：" + countnumber);
        System.out.println("其它字符出现的次数是：" + countOther);
    }
}
