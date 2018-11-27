package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 用户输入一个数字，倒叙输出，并计算每一位数字的和
 * @Data: Created on 2018-11-27 16:41
 */
public class Practice_11 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int data = 0;
        while (num != 0) {
            System.out.print(num % 10);
            data = num % 10 + data;
            num /= 10;
        }
        System.out.println();
        System.out.println("每一位数字的和为：" + data);
    }
}
