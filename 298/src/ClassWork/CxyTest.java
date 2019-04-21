package ClassWork;

public class CxyTest {
    public static void main(String[] args) {
        int[] Salary = {15000,3000};
        Manager manager = new Manager("James",9527,Salary);
        manager.intro();
        manager.showSalary();
        manager.work();

        System.out.println("=========================");
        String[] Salary1 = {"10000","无"};
        Coder coder = new Coder("Kode",0025,Salary1);
        coder.intro();
        coder.showSalary();
        coder.work();

    }
}
