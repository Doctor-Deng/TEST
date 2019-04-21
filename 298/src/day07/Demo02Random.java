package day07;

import java.util.Random;

public class Demo02Random {

    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100 ; i++) {
            int num = r.nextInt(10);        //0到9，左闭合，右开区间。[0,9)           System.out.println(num);
        }
    }
}
