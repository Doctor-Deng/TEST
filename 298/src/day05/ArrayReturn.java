package day05;
/*
    任何数据类型都可以作为的参数类型，或者返回值类型。

    数组作为方法的参数，传递进去的其实是数组的地址值
    数组作为方法的返回值，返回的其实也是数组的
 */
public class ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println(result);
        System.out.println("总和: " + result[0]);
        System.out.println("平均数: " + result[1]);
    }

    public static int[] calculate(int a,int b,int c){
        int sum = a + b +c;        //总和
        int avg = sum / 3;         //平均数
        //两个结果都希望进行返回

        //需要一个数组，也就是以恶搞塑料兜，数组可以保存多个结果
        /*
            int[] array = new int[2];
            array[0] = sum;     //总和
            array[1] = avg;     //平均数
         */

        int[] array = {sum,avg};
        System.out.println("calculate方法内部数组是：");
        System.out.println(array);
        return  array;
    }

}
