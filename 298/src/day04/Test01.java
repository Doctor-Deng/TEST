package day04;
/*
1. 定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
5. main方法中,调用printNum方法,传入a,b
6. main方法中,调用doubling方法,传入a,b
7. main方法中,调用printNum方法,传入a,b
8. main方法中,调用doubling方法,传入a,用a接收返回值
9. main方法中,调用doubling方法,传入b,用b接收返回值
10. main方法中,调用printNum方法,传入a,b
 */
public class Test01 {
    public static void main(String[] args) {
        //定义int类型a为10,b为10.
        int a = 10;
        int b = 10;
        printNum(a,b);
        doubling(a,b);
        printNum(a,b);

        System.out.println("******************");

        a = doubling(a);
        b = doubling(b);
        printNum(a,b);
    }

    //定义printNum方法,参数为（int ivar , int ivar2），返回值无，输出ivar和ivar2的值
    public static void printNum(int iVar,int iVar2){
        System.out.println("iVar:" + iVar + ",iVar2:" + iVar2);
    }

    //定义doubling方法，参数为（int r,int p），返回值无，方法内r和p翻倍，并调用printNum方法，输出r和p的值
    public static void doubling(int r,int p){
        r = r * 2;
        p = p * 2;
        printNum(r,p);
    }

    //定义doubling方法，参数为(int r),返回值int,方法内r翻倍，返回r.
    public static int doubling(int r){
        r = r * 2;
        return r;
    }
}
