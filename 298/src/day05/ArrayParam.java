package day05;
/*
    数组可以作为方法的参数
    当调用方法时，向方法的小括号进行传参，传递进去的其实是数组的地址
 */
public class ArrayParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,55,66,44};
        printArray(array);
        System.out.println("=========AAA==========");
        printArray(array);
        System.out.println("=========BBB==========");
        printArray(array);
        System.out.println("=========CCC==========");
        printArray(array);
    }
    /*
        三要素
        返回值类型：只是进行打印，没有进行计算，所以用void
        方法名称：printArray
        参数类型：int[] array
     */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
