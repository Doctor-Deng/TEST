package day06;

public class Phone {

    String brand;   //品牌
    String color;   //颜色
    double price;   //价格

    public void call(String who){
        System.out.println("给" +who + "打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}
