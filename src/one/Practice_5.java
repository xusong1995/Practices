package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 次方计算：计算X的Y次方，X（底数）和Y（指数）的值由用户输入
 * @Data: Created on 2018-11-27 14:16
 */
public class Practice_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入底数X");
        double x = scanner.nextDouble();
        System.out.println("请输入指数Y");
        double y = scanner.nextDouble();
        double result = Math.pow(x, y);
        System.out.println("X的Y次方为：" + result);
    }
}
