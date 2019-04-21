package ArrayWork;

/*
    小写字母a——97，大写字母A——65
 */

public class Four {
    public static void main(String[] args) {
        //获取长度100的字符数组
        char[] charArray = {'a','l','f','m','f','o','b','b','s','n'};
        //统计字符数组中字母出现次数
        printCount(charArray);
    }
    public static void printCount(char[] charArray){
        //定义一个新数组长度为26
        int[] count = new int[26];
        //对应保存字母出现的次数
        for (int i = 0; i < charArray.length; i++) {
            int number  = charArray[i];
            count[number- 97]++;                //count[97-97]++ = 1
        }
        //打印字母和次数
        for (int i = 0, ch = 97; i < count.length; i++, ch++) {
            if (count[i] != 0 ) {
                System.out.println((char) ch + "--" + count[i]);
            }
        }
    }
}
