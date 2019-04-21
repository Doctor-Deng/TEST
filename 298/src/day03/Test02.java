package day03;
/*
1. 定义类 Test2
2. 定义 main方法
3. 定义变量 discount为1, totalPrice为550
4. 判断当`totalPrice >=500` ,discount赋值为0.5
5. 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.6
6. 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.7
7. 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.8
8. 输出totalPrice.
9. 输出totalPrice 与 discount 的积
 */
public class Test02 {
    public static void main(String[] args){
        //定义变量discount
        double discount = 1.0;
        int totalPrice = 550;
        if (totalPrice >=500) {
            discount = 0.5;
        }else{
                 if (totalPrice >= 400 && totalPrice < 500){
                     discount = 0.6;
                 }else {
                     if (totalPrice >= 300 && totalPrice < 400){
                         discount = 0.7;
                     }else {
                         if (totalPrice >= 200 && totalPrice < 300){
                             discount = 0.8;
                            }else {
                         }
                     }
                 }
            }
        System.out.println("totalPrice的值为："+ discount + "\ntotalPrice与discount的积为："+(totalPrice*discount));
        }
    }
