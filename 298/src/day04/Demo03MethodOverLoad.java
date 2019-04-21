package day04;
/*
    方法重载例子
 */
public class Demo03MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(sum(1.1,1));
        System.out.println(sum(2,2.1));
        System.out.println(sum(1.4,1.5));
        System.out.println(sum(1,2));
        System.out.println(sum(2,3,4));
        System.out.println(sum(5,6,7,8));
    }

    public static int sum(double a,int b){
        System.out.println("前double后int的数执行了！");
        return (int) (a + b);
    }

    public static int sum(int a,double b){
        System.out.println("前int后double的数执行了！");
        return (int) (a + b);
    }

    public static int sum(double a,double b){
        System.out.println("前后double的数执行了！");
        return (int) (a + b);
    }

    public static int sum(int a,int b){
        System.out.println("两个数相加的方法被执行了");
        return a + b;
    }
    public static int sum(int a,int b,int c){
        System.out.println("三个数相加的方法被执行了");
        return a + b + c;
    }
    public static int sum(int a,int b,int c,int d){
        System.out.println("两个数相加的方法被执行了");
        return a + b + c + d;
    }
}
