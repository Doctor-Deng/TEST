package MathWork;

import java.util.Scanner;
/*
题目：键盘录入QQ号码，验证格式的正确性。

- 必须是5—12位数字。
- 0不能开头。
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String qq = scanner.next();
        boolean b = Tsst(qq);
        System.out.println("该QQ号是否正确：" + b);
    }

    public static boolean Tsst(String qq){
        if (qq.length() < 5 || qq.length() > 12){
            return false;
        }
        if (qq.charAt(0) == '0'){
            return false;
        }

        //验证字符串中每个字符都必须是数字字符‘0’ - ‘9’之间的字符
        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
