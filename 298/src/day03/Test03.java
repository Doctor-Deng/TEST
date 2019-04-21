package day03;

/*
1. 定义类 Test3
2. 定义 main方法
3. 使用for循环,初始化变量r为10,当`r>0`时,进入循环
4. for循环内,定义变量c,赋值为r
5. for循环内,使用while循环,当`c>=0`时,输出c,再将c减2赋值给c
6. for循环内,while循环外,r除以c赋值给r
 */
public class Test03 {
    public static void main(String[] args){
        for (int r = 10;r > 0;){
            int c = r;
            while (c>=0){
                System.out.println("c的值为："+c);
                c = c-2;
            }
            r = r / c;
        }
    }
}
