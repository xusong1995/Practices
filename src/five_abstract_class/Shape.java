package five_abstract_class;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 定义一个Shape抽象类
 * @Data: Created on 2018-12-07 10:57
 */
public abstract class Shape {
    {
        System.out.println("执行Shape的初始化块。。。");
    }

    private String color;

    //定义一个计算周长的抽象方法
    public abstract double calPerimeter();

    //定义一个返回形状的抽象方法
    public abstract String getType();

    //定义Shape的构造器，该构造器不是用于创建Shape对象，而是被子类调用
    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
