package day05;

public class Demo01Array {
    public static void main(String[] args) {
        //省略格式的静态初始化
        int[] arrayA = { 10, 20, 30};

        //静态初始化的标准格式，可以拆分为两个步骤
        int[] arrayB;
        arrayB = new int[] { 11, 21, 31};

        //动态初始化也可以拆分为两个步骤
        int[] arrayC;
        arrayC = new int[5];

    }
}
