package four_container;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 在使用Iterator遍历集合元素时，集合元素不可以被改变，否则将出现java.util.Concurrent ModificationException异常
 * @Data: Created on 2018-12-07 20:37
 */
public class IteratorRrrorTest {
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
                //使用Iterator迭代过程中，不可修改集合元素，下面代码将引发异常
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
