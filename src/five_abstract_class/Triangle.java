package five_abstract_class;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 定义一个三角形类，三角形类必须实现Shape类里的抽象方法
 * @Data: Created on 2018-12-07 11:10
 */
public class Triangle extends Shape {
    //定义三角形的三边
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.setSides(a, b, c);
    }

    public void setSides(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("三角形两边之和必须大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return getColor() + "三角形";
    }
}
