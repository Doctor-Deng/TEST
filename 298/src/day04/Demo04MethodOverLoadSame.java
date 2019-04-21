package day04;

/*
    题目要求：
    比较两个数据是否相等。
    参数比较类型分别为两个Byte类型，两个short类型，两个int类型，两个long类型
 */

public class Demo04MethodOverLoadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short) 1,(short) 1));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,12L));
    }

    public static boolean isSame(double a,double b){
        System.out.println("两个double变量的方法被调用了");
        boolean same;
        if (a == b ){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isSame(short a,short b){
        System.out.println("两个short变量的方法被调用了");
        boolean same;
        same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("两个int变量的方法被调用了");
        return a == b;
    }

    public static boolean isSame(long a,long b){
        System.out.println("两个long变量的方法被调用了");
        boolean same;
        if (a == b){
            return true;
        }else {
            return false;
        }

    }
}