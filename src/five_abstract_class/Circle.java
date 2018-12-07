package five_abstract_class;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 定义一个Circle类
 * @Data: Created on 2018-12-07 11:34
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //重写shape类的计算周长的抽象方法
    @Override
    public double calPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return getColor() + "圆形";
    }

    public static void main(String[] args) {
        Shape shape1 = new Triangle("黑色", 3, 4, 5);
        Shape shape2 = new Circle("红色", 5);
        System.out.println(shape1.getType());
        System.out.println(shape1.calPerimeter());
        System.out.println(shape2.getType());
        System.out.println(shape2.calPerimeter());
    }
}
