package day04;

public class MyTestMethod {
    public static void main(String[] args) {
        Method1(2,2);
    }
    public static int Method1(int a,int b){
            if (a > b) {
                System.out.println(a + "的值大");
                return a;
            } else if (a < b){
                System.out.println(b + "的值大");
                return b;
            }else {
                System.out.println("a与b的值相等");
                return 0;}
    }
}
