package day05;

public class Demo03ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];

        System.out.println(array);//内存地址值
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //0
        System.out.println(array[2]);   //0
        System.out.println("=====================");

        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
