package day07;

import java.util.Scanner;

public class Demo03ScannerMaxTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;
        if(a >= 0){
            max = a;
        }else if(b > max){
            max = b;
        }else if (c > max){
            max = c;
        }
        System.out.println(max);
    }
}
