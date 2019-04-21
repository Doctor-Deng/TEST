package day05;

public class Demo08ArrayLengthFor {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] arrayB = {1,2,3,4,5,6,7,6,4,5,46,654,65,4,64,654,};
        for (int i = 0; i < arrayB.length; i++) {       //arrayB.fori 快速写出for循环
            System.out.println(arrayB[i]);              //打印出arrayB的数组的每一个值
        }
    }
}
