package day03;
/*
1. 定义类 Test4，定义 main方法
2. main方法中,定义int类型变量 a为10,b为20,c为30
3. 定义 method1方法, 定义变量a为-5,变量b为--a,判断a为偶数,则a赋值为++b,否则b赋值为--a.打印a,b
4. 定义 method2方法, 定义变量a为0,使用while循环,判断a<=5,进入循环.
5. while循环内部,使用for循环,初始化int类型变量b为1,当b<=5时进入循环, 步进表达式b++
6. for循环内,不换行输出i并拼接" "
7. for循环外,输出换行.
8. j自增.
9. main方法调用method1方法,method2方法
10. 输出a,b,c
 */
public class Test04 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        method1();
        method2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void method1(){
        int a = -5;
        int b = --a;
        if(a % 2 == 0){
            a = ++b;
        }
        else{
            b = --a;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----------------");

    }
    public static void method2(){
        int a = 0;
        while (a <= 5){
            for(int b = 1;b <= 5;b++){
                System.out.print(b + " ");
            }
            System.out.println("\n");
            a++;
        }
        System.out.println("-----------------");
    }
}
