package day07;

import java.util.Scanner;       //导包

public class Demo03ScannerMax {
    public static void main(String[] args) {
        //创建
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] ArrayB = {};
        ArrayB = new int[]{a,b,c};
        int max;
        max = ArrayB[0];
        for (int i = 1; i < ArrayB.length; i++) {
            if (ArrayB[i] > max)
                 max = ArrayB[i];
        }
        System.out.println(max);


    }
}
