package MathWork;

import java.util.Random;
import java.util.stream.DoubleStream;

public class Test05 {
    public static void main(String[] args) {
        double random = Math.random()*100;
        System.out.println("随机数为：");
        System.out.println(random);

        //indexOf      查找参数字符串在本字符串当中首次出现的索引位置，如果没有就返回-1
        String str = random + "";
        int index = str.indexOf(".");
        System.out.println(".在的位置" + index);
//        public String substirng(int index): 截取从参数位置一直到末尾，返回新的字符串
//        public String substring(int begin,int end)：从begin号索引开始到end后索引结束，[begin,end)
        String substring = str.substring(0, index + 3);
        System.out.println("转换为：");
        System.out.println(substring);
    }
}
