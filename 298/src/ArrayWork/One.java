package ArrayWork;

public class One {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,66,70,80,99};
        printf(array);
    }
    public static void printf(int[] array){
        System.out.println("您的大乐透号码为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
