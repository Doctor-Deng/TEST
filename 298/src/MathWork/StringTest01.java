package MathWork;
/*
    拼接字符串类型，定义一个方法，把数组{1,2,3}按照指定格式拼接一个字符串。格式参照如下：[word1#word2#word3]
    分析思路：
    1、定义一个int数组
    2、格式[]要用到if判断
    3、格式中有重复内容for循环
     */
public class StringTest01 {
    public static void main(String[] args) {
        //定义一个int型的数组
        int[] array = {1, 2, 3};
        String result = arrayTostring(array);
        System.out.println(result);
    }
    public static String arrayTostring(int[] array){
        String s = "[";
            for (int i = 0; i < array.length; i++) {
                if (i == array.length-1){
                    s += "word" + array[i] + "]";
                }else {
                    s += "word" + array[i] + "#";
                }
            }
            return s;
    }
}
