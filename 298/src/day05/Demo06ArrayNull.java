package day05;
/*
    空指针异常：NullPointerException
    array里面是null，什么都没有。
    array[0]去进行访问会进行报错，空指针异常
    数组要new初始化之后才能使用

    问题：忘了null
    解决：使用new创建

 */
public class Demo06ArrayNull {
    public static void main(String[] args) {
        int[] array = null;         //程序会报错
        System.out.println(array[0]);
    }
}
