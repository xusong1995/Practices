package four_container;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 示范List集合的常规用法
 * @Data: Created on 2018-12-08 21:10
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        //向books集合中添加3个元素
        books.add(new String("java编程思想"));
        books.add(new String("java核心技术"));
        books.add(new String("疯狂Java讲义"));
        //输出books集合中的元素
        System.out.println(books);
        //将新字符串插入到第二个位置
        books.add(2, new String("大话数据结构"));
        //输出books集合中的元素
        System.out.println(books);
        //通过循环遍历的方式输出books集合中的元素
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        //删除第三个元素
        books.remove(3);
        System.out.println(books);
        //判断指定元素在List集合中的索引
        System.out.println(books.indexOf(new String("java编程思想")));
        //将第二个元素替换成新的字符串对象
        books.set(1, new String("疯狂java讲义"));
        System.out.println(books);
        //将books的第二个元素（包括）到第三个元素（不包括）截取成子集合
        System.out.println(books.subList(1, 2));
    }
}
