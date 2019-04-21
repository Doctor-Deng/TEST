package day06;
/*
    构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法，
    public 类名称（参数类型 参数名称）   {
        方法体
      }
    注意事项：
    1、构造方法的名称必须和所在的类名称一样，严格区分大小写
    2、构造方法不要写返回值类型，连void都不写
    3、构造方法不能return一个具体的返回值
    4、如果没有编写任何构造方法，那么编译器将会默认生成一个构造方法，没有参数，什么都不做。
 */
public class StudentTest {
    //成员变量
    private String name;
    private int age;

    //无参数的构造方法
    public StudentTest(){
        System.out.println("无参构造方法执行了！");
    }

    //有参数的构造方法
    public StudentTest(String name,int age){
        System.out.println("全参构造方法执行了！");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        if (num < 0 || num > 120){
            age = 0;
            System.out.println("年龄格式不正确！");
        }else {
            age = num;
        }
    }
}
