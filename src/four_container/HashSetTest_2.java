package four_container;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 如果向hashCode()中添加一个可变对象后，后面的程序修改了该可变对象的Field，则可能导致它与集合中的其他元素
 * 相同（即两个对象通过equals()方法比较返回true，两个对象的hashcode值也相等），这就有可能导致HashSet中包含两个相同的对象
 * 下面程序演示了这种情况
 * @Data: Created on 2018-12-08 14:00
 */
class R {
    int count;

    //构造方法
    R(int count) {
        this.count = count;
    }

    //重写toString()方法
    public String toString() {
        return "R[count:" + count + "]";
    }

    //重写equals()方法
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == R.class) {
            R r = (R) obj;
            if (r.count == this.count) {
                return true;
            }
        }
        return false;
    }

    //重写hashCode()方法
    public int hashCode() {
        return this.count;
    }
}

public class HashSetTest_2 {
    public static void main(String[] args) {
        //定义一个hashSet集合,并向里面添加元素
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        //打印hashSet集合
        System.out.println(hs);
        //取出第一个元素
        Iterator iterator = hs.iterator();
        R first = (R) iterator.next();
        //为第一个元素的count实例变量赋值
        first.count = -3;
        //再次输出hashSet集合，集合元素有重复元素
        System.out.println(hs);
        //删除count为-3的R对象
        hs.remove(new R(-3));
        //可以看到被删除了一个R元素
        System.out.println(hs);
        //输出false
        System.out.println("hs是否包含count为-3的R对象?  " + hs.contains(new R(-3)));
        //输出false
        System.out.println("hs是否包含count为5的对象?  " + hs.contains(new R(5)));
    }
}
