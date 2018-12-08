package four_container;

import java.util.EnumSet;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 示范如何使用EnumSet来保存枚举类的多个枚举值
 * @Data: Created on 2018-12-08 16:19
 */
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumSetTest {
    public static void main(String[] args) {
        //创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
        EnumSet enumSet_1 = EnumSet.allOf(Season.class);
        //输出集合中的元素
        System.out.println("集合1中的值为：" + enumSet_1);
        //创建一个EnumSet空集合，指定其集合元素是Season类的枚举值
        EnumSet enumSet_2 = EnumSet.noneOf(Season.class);
        //输出集合中的元素
        System.out.println("集合2中的值为：" + enumSet_2);
        //手动为集合添加元素
        enumSet_2.add(Season.SPRING);
        enumSet_2.add(Season.SUMMER);
        //再次输出集合2中的元素
        System.out.println("集合2中的值为：" + enumSet_2);
        //以指定枚举类创建EnumSet集合
        EnumSet enumSet_3 = EnumSet.of(Season.SPRING, Season.SUMMER, Season.AUTUMN);
        //输出集合3中的元素
        System.out.println("集合3中的值为：" + enumSet_3);
        //创建一个包含从SUMMER到WINTER范围内所有枚举值的EnumSet集合
        EnumSet enumSet_4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        //输出集合4中的元素
        System.out.println("集合4中的值为：" + enumSet_4);
        //创建一个新集合——集合5，其和集合4元素有相同的类型
        //集合5和集合4元素加起来等于Season枚举类的全部枚举值
        EnumSet enumSet_5 = EnumSet.complementOf(enumSet_4);
        //输出集合5里的值
        System.out.println("集合5中的值为：" + enumSet_5);
    }
}
