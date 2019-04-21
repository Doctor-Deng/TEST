package MathWork;
/*
    reverseStr:字符串逆序，要求不分配额外的空间。
 */
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println("录入的字符串：" + string);
        String s = reverseStr(string);
        System.out.println("反转的字符串: " + s);
    }
//  定义一个方法，将反转的字符串一个个放在一个新变量中，再返回给主函数
    public static String reverseStr(String string){
        String s = "";
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {    //倒序遍历，记得int i=chars.length -1
            s = s + chars[i];
        }
        return s;
    }
}
