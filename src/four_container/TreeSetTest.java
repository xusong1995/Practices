package four_container;

import java.util.TreeSet;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 测试TreeSet的通用用法
 * @Data: Created on 2018-12-08 15:15
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        //向TreeSet集合中添加4个Interge对象
        nums.add(3);
        nums.add(5);
        nums.add(4);
        nums.add(-5);
        //输出集合元素,可以看到几何元素已经处于排序状态
        System.out.println(nums);
        //输出集合里的第一个元素
        System.out.println(nums.first());
        //输出集合里的最后一个元素
        System.out.println(nums.last());
        //返回小于4的子集，不包含4
        System.out.println(nums.headSet(4));
        //返回大于5的子集，如果集合中包含5，子集中也包含5
        System.out.println(nums.tailSet(5));
        //返回大于等于-3，小于4的子集[-3,4)
        System.out.println(nums.subSet(-3, 4));
    }
}
