package day05;
/*
    数组元素的反转
 */
public class Demo10ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5,6};
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("======================");
        for (int min = 0,max = arrayA.length-1; min<max ; min++,max--) {
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }


        for (int a = 0; a < arrayA.length; a++) {
            System.out.println(arrayA[a]);
        }
    }
}
