package day07;

import java.util.ArrayList;
import java.util.Random;
/*
    生成6个1-33之间的随机数，添加到集合，并遍历集合
 */
public class Test01ArrayList {

    public static void main(String[] args) {

        //创建一个随机数对象
        Random random = new Random();

        //创建一个ArrayList集合
        ArrayList<Integer> list = new ArrayList<>();

        //使用for循环，产生六个随机数1-33范围
        for (int i = 0; i < 6; i++) {
            int r = random.nextInt(33 + 1);
            list.add(r);
        }
        //遍历数组
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        }
    }

