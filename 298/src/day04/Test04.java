package day04;

public class Test04 {
    public static void main(String[] args) {
        showcolor("red");
    }
    //在showColor方法中，使用switch语句，判断颜色。
    public static void showcolor(String color){
        switch (color){
            case "red":
                System.out.println(color+"是红色！");
                break;
            case "blue":
                System.out.println(color+"是蓝色！");
                break;
            case "green":
                System.out.println(color+"是绿色！");
                break;
                default:
                    System.out.println("颜色未知");
        }
    }
}
