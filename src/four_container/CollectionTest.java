package four_container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 操作Collection里的元素
 * @Data: Created on 2018-12-07 10:30
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //添加元素
        c.add("孙悟空");
        //虽然集合里面不能放基本类型的值，但java支持自动装箱
        c.add(6);
        //输出c集合里面的元素个数
        System.out.println("c集合的元素个数为：" + c.size());
        //删除指定元素
        c.remove(6);
        System.out.println("c集合的元素个数为：" + c.size());
        //判断是否包含指定字符串
        System.out.println("c集合是否包含“孙悟空”字符串:   " + c.contains("孙悟空"));
        c.add("许松");
        c.add("java编程思想");
        c.add("java核心技术");
        //输出c集合的元素
        System.out.println("c集合的元素为:" + c);

        Collection book = new HashSet();
        book.add("java编程思想");
        book.add("java核心技术");
        System.out.println("c集合是否包含book集合：" + c.containsAll(book));
        //删除c集合里的孙悟空元素
        c.remove("孙悟空");
        //用c集合减去book集合里面的元素
        c.removeAll(book);
        //输出c里面的元素
        System.out.println("c集合的元素为:" + c);
        //删除c里面的所有元素
        c.clear();
        System.out.println("c集合的元素为:" + c);
        c.add("java编程思想");
        //book集合里只剩下c集合也包含的元素
        book.retainAll(c);
        System.out.println("book集合的元素" + book);
    }
}
