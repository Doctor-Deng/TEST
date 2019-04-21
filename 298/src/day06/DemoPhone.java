package day06;

public class DemoPhone {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("========================");

        one.brand = "小米";
        one.color = "奢华灰";
        one.price = 99999.00;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("============================");
        one.call("马克强");
        one.sendMessage();
    }
}
