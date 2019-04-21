package ClassWork;

public class Coder {
    private String name;
    private int id;
    private String[] salary;       //基本工资  +   奖金

    public Coder() {
    }

    public Coder(String name, int id, String[] salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getSalary() {
        return salary;
    }

    public void setSalary(String[] salary) {
        this.salary = salary;
    }


    public void intro(){
        System.out.println("程序员姓名：" + name);
        System.out.println("工号：" + id);
    }

    public void showSalary(){
        System.out.println("基本工资：" + salary[0] + " 奖金：" +salary[1]);
    }
    public void work(){
        System.out.println("正在努力写代码.........");
    }
}