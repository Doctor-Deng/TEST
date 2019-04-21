package day03;

/*
 * 编写步骤：
 * 1. 定义类 Test1
 * 2. 定义 main方法
 * 3. 定义变量i为0,i2为10
 * 4. 使用第一个while循环,当条件为`i小于5` 时,则进入循环
 * 5. 循环内,i自增,i2自增
 * 6. 循环内,使用if判断,当`i大于等于 2 ` 并且` i2小于15` 时,同时输出i和i2的值
 * 7. 使用第二个while循环,当条件为`i2小于20` 时,则进入循环
 * 8. 循环内,i自增,i2自增
 * 9. 循环内,使用if判断,当`i大于8 ` 或者`i2小于等于18` 时,同时输出i和i2的值
 */

public class Test01 {
    public static void main(String[] args){
        int i = 0;
        int i2 = 10;
        while (i < 5){
            i++;
            i2++;
            if (i >= 2 && i2 < 15){
                System.out.println("i的值为："+ i + "\ni2的值为：" + i2);
            }
        }
        System.out.println("--------------------");
        while (i2 < 20){
            i++;
            i2++;
            if (i > 8 || i2 <= 18){
                System.out.println("i的值为："+ i + "\ni2的值为：" + i2);
            }
        }
    }
}
