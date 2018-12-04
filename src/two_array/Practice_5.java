package two_array;

import java.util.Arrays;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 创建一维数组，再创建一个数组，对两个有序的数组进行合并，并将重复的数字去掉的方法
 * @Data: Created on 2018-11-29 16:21
 */
public class Practice_5 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {1, 2, 3};
        Practice_5 test = new Practice_5();
        test.sort(a);
        System.out.println("排序后的A数组为：");
        test.printArray(a);
        test.sort(b);
        System.out.println("排序后的B数组为：");
        test.printArray(b);
        int[] c = test.merge(a, b);
        test.sort(c);
        System.out.println("排序后的C数组为：");
        test.printArray(c);
    }

    public int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    public void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
