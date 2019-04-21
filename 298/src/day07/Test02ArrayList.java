package day07;

import java.util.ArrayList;

public class Test02ArrayList {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student student = new Student("蔡徐坤",1);
        Student student1 = new Student("谢广坤",2);
        Student student2 = new Student("杨坤",3);
        Student student3 = new Student("温伟坤",4);

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "\n年龄：" + stu.getAge());
        }
    }
}
