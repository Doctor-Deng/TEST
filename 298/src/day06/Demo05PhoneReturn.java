package day06;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhont();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhont(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8888.0;
        one.color = "玫瑰金";
        return one;
    }
}
