package day06;
/*
    当方法的局部变量和类的成员变量重名的时候，根据“就近原则”,优先使用局部变量
    如果需要访问本类中的成员变量，需要使用格式，
    this.成员变量名

    "通过谁调用的方法，谁就是this"
    方法调用对象，this指代这个对象
 */
public class PersonTest {

    String name;    //别人的名字     成员变量

    //参数name是自己的名字
    //成员变量name是别人的名字

    public void sayHello(String name) {
        System.out.println(this.name +  "，你好，我是" +name);     //this.name 用的是成员变量，颜色都是一样的
            System.out.println(this);
        }
}
