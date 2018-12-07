package four_container;

import java.util.HashSet;
import java.util.Set;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 实例：HashSet判断集合元素相同的标准
 * @Data: Created on 2018-12-07 21:43
 */
//类A的equals()方法总是返回true，但没有重写其hashcode()方法
class A {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

//类B的hashcode()方法总是返回1，但没有重写其equals()方法
class B {
    @Override
    public int hashCode() {
        return 1;
    }
}

//类C的hashcode()方法总是返回2，且重写了其equals()方法
class C {
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

//C类重写了equals()方法和hashcode()方法，equals方法总是返回true，hashcode()方法总是返回2，这会导致HashSet把两个对象当成是一个对象
//所以第二次添加C对象是添加不了
public class HashSetTest {
    public static void main(String[] args) {
        Set books = new HashSet();
        //分别向集合中添加两个A对象，两个B对象，两个C对象
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
