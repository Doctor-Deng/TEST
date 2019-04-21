package day06;

public class Demo08StudentTest {
    public static void main(String[] args) {
        StudentTest studentTest = new StudentTest();
        StudentTest studentTest1 = new StudentTest("蔡徐坤",2);
        System.out.println("姓名：" + studentTest1.getName()+ "\n年龄：" + studentTest1.getAge());
        System.out.println("=======================");
        studentTest1.setAge(-1);
        System.out.println("姓名：" + studentTest1.getName()+ "\n年龄：" + studentTest1.getAge());

    }
}
