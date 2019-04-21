package ArrayWork;

public class Two {
    public static void main(String[] args) {
        String[] arrayhuase = {"黑桃","红桃","梅花","方块"};        //定义一个字符串数组，花色
        String[] arraynumber = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};      //定义一个字符串数组，数字加字母
        for (int i = 0; i < arrayhuase.length; i++) {                   //使用for循环循环花色
            for (int j = 0; j < arraynumber.length; j++) {              //嵌套for循环，循环数字加字母
                System.out.print(arrayhuase[i] + arraynumber[j] + " "); //字符串的拼接，加格式
            }
            System.out.println("");         //每循环一个花色就换行
        }
    }
}