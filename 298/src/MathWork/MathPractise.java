package MathWork;
/*
    计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
 */
public class MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for(int i = (int)min; i < max; i++){
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                count++;
            }
        }
        System.out.println("符合条件的数字一共有：" + count +"个");
    }
}
