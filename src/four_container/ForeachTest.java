package four_container;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 使用foreach遍历集合元素
 * @Data: Created on 2018-12-07 20:54
 */
public class ForeachTest {
    public static void main(String[] args) {
        //创建集合
        Collection books = new ArrayList();
        books.add("java编程思想");
        books.add("java核心技术");
        books.add("习近平谈治国理政");
        for (Object obj : books
        ) {
            String book = (String) obj;
            System.out.println(book);
            //使用Foreach遍历集合元素时，不可以改变集合元素，否则会发生错误
            //books.remove(book);
        }
        System.out.println(books);
    }
}
