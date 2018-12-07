package four_container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 示范通过Iterator接口来遍历集合元素
 * @Data: Created on 2018-12-07 20:15
 */
public class IteraterTest {
    public static void main(String[] args) {
        //创建一个集合
        Collection books = new HashSet();
        books.add("java编程思想");
        books.add("徐鹏飞谈治国理政");
        books.add("java核心技术");
        //获取books集合对应的迭代器
        Iterator iterator_books = books.iterator();
        while (iterator_books.hasNext()) {
            //iterator_books.next()方法返回的数据类型为Object类型
            //需要进行强制转换
            String book = (String) iterator_books.next();
            System.out.println(book);
            if (book.equals("java编程思想")) {
                //从集合中删除上一次next方法返回的元素
                iterator_books.remove();
            }
            //对book变量赋值，不会改变集合元素本身
            //book = "测试字符串";
        }
        System.out.println(books);
    }
}
