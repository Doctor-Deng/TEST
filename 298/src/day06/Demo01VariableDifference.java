package day06;
/*
   —————变量差异——————
    1、**定义**的**位置**不一样【重点】
    局部变量： 在方法的内部
    成员变量： 在方法的外部，直接写在类当中

    2、**作用范围**不一样【重点】
    局部变量： 只有方法当中才能用，出了方法就不能用了
    成员变量： 整个类都可以用

    3、**默认值**不一样【重点】
    局部变量： 没有默认值，如果要使用，必须手动赋值
    成员变量： 如果没有赋值，会有默认值，规则和数组一样
 */
public class Demo01VariableDifference {
    public static void main(String[] args) {
        String name;    //成员变量 ， 有默认值null
        test(8);
    }
    public static void test(int age){
        System.out.println(age);        //不报错，因为方法的参数虽然是局部变量，但是方法被调用后，执行的时候，必然会被赋值

        //int agetest;
        //System.out.println(agetest);    //报错，因为agetest作为一个局部变量，没有赋值

    }
}
