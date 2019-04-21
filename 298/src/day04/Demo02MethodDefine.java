package day04;
/*
方法其实是若干语句的功能集合。

方法好比一个工厂。
蒙牛工厂    原料：奶牛、饲料、水
           产出物：奶制品

参数（原料）：进入方法的数据
返回值（产出物）：就是从方法中出来的数据

定义方法的完整格式：
修饰符 返回值类型 方法名称（参数类型 参数名称，.....）{
    方法体
    return 返回值;
}

1：单独调用：方法名称（参数）；没有打印没有赋值只是让方法调用

2：打印调用：System.out.println(方法名称（参数）);把方法调用写到输出语句,return后面的结果可以打印

3：赋值调用：数据类型 变量名称 = 方法名称（参数）；将结果赋值给变量,变量可以进行别的操作

注意：此前学习的方法，返回值类型固定写为void,这种方法只能单独调用，不能进行打印调用或者赋值调用。
 */
public class Demo02MethodDefine {
    public static void main(String[] args) {

        //单独调用
        sum(2,3);
        System.out.println("===========");

        //打印调用
        System.out.println("sum的值为:" + sum(2,3));
        System.out.println("===========");

        //赋值调用
        int c = sum(2,3);
        c += 5;
        System.out.println("c的值为：" + c);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行了");
        int result = a + b;
        return result;
    }
}
