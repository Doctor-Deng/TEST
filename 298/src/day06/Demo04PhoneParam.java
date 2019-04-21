package day06;
/*
    使用对象类型作为方法的参数
 */
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one  = new Phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "土豪金";

        method(one);    //传递进去的参数其实就是地址值
    }

    public static void method (Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
