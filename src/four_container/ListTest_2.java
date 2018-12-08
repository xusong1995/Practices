package four_container;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: List判断两个对象相等只要通过equals()方法比较返回true即可
 * @Data: Created on 2018-12-08 22:08
 */
class X {
    //重写X类equals()方法
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListTest_2 {
    public static void main(String[] args) {
        //创建集合
        List books = new ArrayList();
        books.add(new String("java编程思想"));
        books.add(new String("java疯狂讲义"));
        books.add(new String("java核心技术"));
        System.out.println(books);
        //删除集合中的X对象，将导致第一个元素被删除
        //程序试图删除一个X对象，List会调用该X对象的equals()方法依次与集合元素进行比较
        //而X类重写了equals()方法,总是返回true,所以我们每次从集合中删除X对象，总是产出集合中的第一个元素
        books.remove(new X());
        System.out.println(books);
        //删除集合中的X对象，再次删除集合中的第一个元素
        books.remove(new X());
        System.out.println(books);
    }
}
