package ClassWork;

public class SchoolTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("周老师");
        teacher.setContent("java面向对象的知识");
        teacher.eat();
        teacher.student();
        Student student = new Student("韩同学",18,"java面向对象");
        student.eat();
        student.study();
    }
}
