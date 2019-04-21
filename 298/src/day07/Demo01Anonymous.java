package day07;

/*
    创建对象的标准格式，
    类名称 对象名 = new 类名称

    匿名对象
    注意事项：匿名对象只能使用唯一的一次，下次再用就不得不创建一个
    使用建议：如果确定有一个对象只需使用唯一的一次，就可以使用匿名对象，
 */
public class Demo01Anonymous {
        //本类中new了三个对象
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person person = new Person();       //第一个对象
        person.name = "哈皮";
        person.showname();
        System.out.println("============");

        //匿名对象
        new Person().name = "蔡徐坤";  //第二个对象
        new Person().showname();    //我叫null，第三个对象

    }
}
