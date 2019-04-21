package APIWork;

import java.util.ArrayList;
import java.util.Random;

public class Testfour {
    public static void main(String[] args) {
        //获取随机分数
        ArrayList<Integer> scoreList = getScoreList();

        //定义计数的变量
       ArrayList<Integer> arrayListcount =  countScore(scoreList);


        printCount(arrayListcount);

    }

    public static ArrayList<Integer> getScoreList() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int r = random.nextInt(100) + 1;
            arrayList.add(r);
        }
        return arrayList;
    }

    public static ArrayList<Integer> countScore(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arrayListcount = new ArrayList<>();
        int count100 = 0;
        int count79 = 0;
        int count59 = 0;
        int count39 = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            Integer score = arrayList.get(i);
            if (score <= 100 && score >= 80) {
                count100++;
            } else if (score <= 79 && score >= 60) {
                count79++;
            } else if (score <= 59 && score >= 40) {
                count59++;
            }else {
                count39++;
            }
        }
        arrayListcount.add(count100);
        arrayListcount.add(count79);
        arrayListcount.add(count59);
        arrayListcount.add(count39);
        return arrayListcount;
    }

    public static void printCount(ArrayList<Integer> arrayListcount) {
        int start = 100;
        int end = 80;       //一
        System.out.println(arrayListcount.size());
        for (int i = 0; i < arrayListcount.size(); i++) {
            Integer integer = arrayListcount.get(i);
            System.out.println(start + "\t分 --" + end +" \t分:" +
                     integer + "人");
            if (i==0){
                start -= 21;
                end -= 20;          //二
            }else if (i==arrayListcount.size()-2){      //四
                start -=20;
                end -= 40;
            }else {                 //三
                start -= 20;
                end -= 20;
            }
        }
    }

}

