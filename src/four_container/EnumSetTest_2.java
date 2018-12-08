package four_container;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 复制另一个EnumSet集合或者Collection集合中的所有元素来创建新的EnumSet集合
 * 要求collection集合中的所有元素必须是同一个枚举类的枚举值
 * @Data: Created on 2018-12-08 17:08
 */
public class EnumSetTest_2 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.clear();
        c.add(Season.SPRING);
        c.add(Season.SUMMER);
        //复制Collection集合中所有元素来创建EnumSet集合
        EnumSet enumSet_1 = EnumSet.copyOf(c);
        System.out.println(enumSet_1);
        c.add("java编程思想");
        //下面代码出现异常，因为c集合里面的元素不是全部都为枚举值
        //EnumSet enumSet_2 = EnumSet.copyOf(c);
        //System.out.println(enumSet_2);
    }
}
