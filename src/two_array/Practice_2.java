package two_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * @Data: Created on 2018-11-29 12:04
 */
public class Practice_2 {
    public static void main(String[] args) {
        //定义一个升序排列的数组
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //输出原数组
        System.out.println("原数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("请输入要插入的数：");
        Scanner scanner = new Scanner(System.in);
        //暂时存储输入的数至inputNum
        int inputNum = scanner.nextInt();
        //扩充数组长度
        array = Arrays.copyOf(array, array.length + 1);
        //插入
        array[array.length - 1] = inputNum;
        //重新排序
        Arrays.sort(array);
        //输出
        System.out.println("排序后的数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
