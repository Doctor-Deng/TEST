package MathWork;

import java.util.Scanner;

/*
替换某字符串中的某字符串。
    - 键盘录入一个srcStr字符串，再录入一个delStr字符串。
    - 删除该字srcStr符串中的所有delStr字符串。
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.print("请输入源字符串：");
        Scanner scanner = new Scanner(System.in);
        String srcStr = scanner.next();
        System.out.print("请输入要删除的字符串：");
        String delStr = scanner.next();
        printCount(srcStr,delStr);


    }
    //resultStr删除后长度
    public static void printCount(String stcStr,String delStr) {
        String resultStr = stcStr.replace(delStr,"");
//      System.out.println(resultStr.length());         这个是删除后的长度
        int count = (stcStr.length() - resultStr.length()) / delStr.length();
        System.out.println("源字符串中总共包含" + count + " 个 "
                + delStr + " ,\r\n删除" + delStr + "后的字符串为：" + resultStr);
    }
}
