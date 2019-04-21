package ArrayWork;

import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5, 6};
        int[] arrayB = {1, 2, 3, 4, 5, 6};
        print(arrayA);  //面向方法
        print(arrayB);  //面向方法
        System.out.println("======================");
        //下面这种更简单
        System.out.println(Arrays.toString(arrayA));        //面向对象
        System.out.println(Arrays.toString(arrayB));        //面向对象
        System.out.println("是否一致 ：" +equals(arrayA,arrayB));
    }
    public static boolean equals(int[] arrayA,int[] arrayB){
       if (arrayA.length != arrayB.length)
           return false;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i])
                return false;
        }
        return true;
    }

    public static void print(int[] arrayA){
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + ", ");
        }
        System.out.println("");
    }
}
