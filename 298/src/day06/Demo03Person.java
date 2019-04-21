package day06;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "李大爷";
        //person.age = -20;     错误写法年龄没有负数，所以引进了private关键字，再用set和get方法再次访问年龄，用if语句判断年龄的格式
        person.setAge(-20);
        person.show();
    }
}
