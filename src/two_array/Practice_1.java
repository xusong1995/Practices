package two_array;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 对十个数进行排序
 * @Data: Created on 2018-11-29 11:00
 */
public class Practice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[10];
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            inputArray[i] = scanner.nextInt();
        }
        System.out.println("数组的元素是：");
        for (int i = 0; i < 10; i++) {
            System.out.print(inputArray[i]+" ");
        }
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[i]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        System.out.println("排序后数组中的元素为：");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]+" ");
        }
    }
}
