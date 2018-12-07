package four_container;

import java.util.HashSet;
import java.util.Set;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 使用普通Set集合示例
 * @Data: Created on 2018-12-07 21:26
 */
public class SetTest {
    public static void main(String[] args) {
        Set books = new HashSet();
        //添加一个字符串对象
        books.add("java编程思想");
        books.add("习近平谈治国理政");
        //再次添加一个字符串对象，因为两个字符串对象通过equals方法判断相等，所以返回false，添加失败
        boolean result = books.add("java编程思想");
        //下面输出可以看到集合值由两个元素
        System.out.println(result + " --> " + books);
    }
}
