package day07;


import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
          //普通使用方式
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();

        //匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是："  +  num);

//        使用一般写法进入参数
//        Scanner scanner = new Scanner(System.in);
//        methodParam(scanner);

          //使用匿名对象来进行传参
//          methodParm(new Scanner(System.in));
        Scanner scanner = methodReturn();
        int num = scanner.nextInt();
        System.out.println("输入的是：" + num);
    }
    public static void methodParm(Scanner scanner){
            int num = scanner.nextInt();
            System.out.println("输入的值是：" + num);
          }

          public static  Scanner methodReturn(){
//              Scanner scanner = new Scanner(System.in);
//              return scanner;
              return new Scanner(System.in);
          }

}
