package ArrayWork;

import java.util.Arrays;

public class Six {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array) + "是否对称：" +sym(array));
        int[] arrayA = {7, 2, 3, 4, 5, 6, 6};
        System.out.println(Arrays.toString(arrayA) + "是否对称：" +sym(arrayA));
    }

    public static boolean sym(int[] array){
        /*
            start : 数组头
            end ：数组尾
         */
        for (int start = 0,end = array.length-1; start <= end ; start++,end--) {
            if (array[start] != array[end]){
                return false;
            }
        }
        return true;
    }
}
