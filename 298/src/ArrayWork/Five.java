package ArrayWork;

public class Five {
    public static void main(String[] args) {
        //定义一个数组
        int[] arrayA = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        //获取平均分
        int avg = getAvg(arrayA);
        //定义计数的变量
        int count = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] >avg){
                count++;
            }
        }
        System.out.print("高于平均分：" + avg + "的个数有" + count + "个");
    }
    //获取平均分的方法
    public static int getAvg(int[] arrayA){
        int num = 0;
        for (int i = 0; i < arrayA.length; i++) {
            num += arrayA[i];
        }
        return   num / arrayA.length;
    }
}
