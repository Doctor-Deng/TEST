package ClassWork;

public class Circle {
   private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void showArea(){
        System.out.println("半径为：" + r + "面积为：" + 3.14*r*r);
    }

    public void showPerimeter(){

        System.out.println("半径为：" + r + "周长为：" + 2*3.14*r);
    }
}
