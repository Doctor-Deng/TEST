package APIWork;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){       //while(true)无限循环,除非遇到break才会跳出循环
            System.out.println("1.录入信息  0.退出");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    inputStudent(list, scanner);
                case 0:
                    System.out.println("录入完毕");
            }
                if (i == 0){
                    break;
                }else if(i!=0 && i!=1){
                    System.out.println("输入的信息有误，请重新输入！");
                }
        }
        for (int a = 0; a < list.size(); a++) {
            Student student = list.get(a);
            student.show();
        }
    }

    public static void inputStudent(ArrayList<Student> list,Scanner scanner){
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        Student student = new Student(name,age);    //上面的参数传递给Student
        list.add(student);
    }
}
