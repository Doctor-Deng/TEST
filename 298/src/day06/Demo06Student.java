package day06;

public class Demo06Student {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("蔡徐坤");
        student.setAge(28);
        student.setMale(false);

        System.out.println("姓名：" + student.getName());
        System.out.println("年龄：" + student.getAge());
        System.out.println("是不是爷们：" + student.isMale());
    }
}
