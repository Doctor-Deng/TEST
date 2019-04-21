package day05;
/*
    数组的长度一旦确定，在程序运行期间，不可改变
 */
public class Demo07ArrayLength {
    public static void main(String[] args) {
        int[] array = {0,12,1,1,5,54,456,34,0,12,1,1,5,54,456,34,0,12,1,1,5,54,456};
        int leng = array.length;        //定义leng变量去获取array的长度
        System.out.println("这个数组的长度为：" + leng);
        System.out.println("===================");

        int[] arrayA = new int[3];           //arrayA只是一个名字（在栈里面），数组里面的内容都在堆里面（new出来的东西都在堆）
        System.out.println(arrayA.length);   //长度为3
        arrayA = new int[5];                 //这里是一个新的数组，命名为arrayA了，原来的那个长度为3数组还在，只是没有名字了，也就用不了了。
        System.out.println(arrayA.length);   //长度为5
    }
}
