package day05;

public class Demo09ArrayBiggest {
    public static void main(String[] args) {
        int[] arrayA = {5, 15, 20, 555, 10000, 200};
        int max;
        max = arrayA[0];
        for (int i = 1;i < arrayA.length;i++){
            if (arrayA[i] > max){
                max = arrayA[i];
            }
        }
        System.out.println("该数组中最大值：" + max);
    }
}
