package day06;

public class Demo07PersonTest {
    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();
        personTest.name = "蔡徐坤";    //别人的名字
        personTest.sayHello("鹿晗");  //我的名字

        System.out.println(personTest);     //地址值
    }

}
