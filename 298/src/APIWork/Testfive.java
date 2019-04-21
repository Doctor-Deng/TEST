package APIWork;

import java.util.ArrayList;
import java.util.Random;

public class Testfive {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Card> cards = randomCard(n);      //调用randomCard的参数是5,返回值是ArrayList集合
        //System.out.println(cards.size());
        System.out.println("牌一共有：" + allCard().size() + "张");       //测试：这里是已经运行了添加所有牌的方法

        if (cards != null) {
            System.out.println("随机"+ n +"张牌:" );
            for (int i = 0; i < cards.size(); i++) {
                Card card = cards.get(i);
                card.showCard();
            }
        }else {
            System.out.println(n+"超越范围,无法获取牌" );
        }

        System.out.println();
        System.out.println();
        int n2 = 100;
        ArrayList<Card> cards2 = randomCard(n2);

        if (cards2 != null) {
            System.out.println("随机"+ n2 +"张牌:" );
            for (int i = 0; i < cards.size(); i++) {
                Card card = cards.get(i);
                card.showCard();
            }
        }else {
            System.out.println("随机"+ n2 +"张牌:\r\n超越范围,无法获取" );
        }
    }

    public static ArrayList<Card> randomCard(int n){
        if (n > 54 || n < 0)
            return  null;

        ArrayList<Card> rList = new ArrayList<>();
        ArrayList<Card> cards = allCard();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(cards.size());       //产生一个cards里面的一个随机数
            Card rCard = cards.remove(index);               //移除这个数，保存在rCard中
            rList.add(rCard);
        }
        return rList;
    }

    public static ArrayList<Card> allCard(){
        ArrayList<Card> allList = new ArrayList<>();
        //花色数组
        String[] hs = {"黑桃" , "红桃" , "梅花" , "方片"};
        //点数数组
        String[] ds = {"A" , "2" , "3", "4", "5", "6", "7", "8" ,
                "9", "10", "J", "Q", "K"};
        for (int H = 0; H < hs.length; H++) {
            for (int d = 0; d < ds.length; d++) {
                Card card = new Card(hs[H], ds[d]);
                //添加到集合
                allList.add(card);
            }
        }
        return allList;
    }
}
