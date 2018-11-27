package one;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 九九乘法表：尝试用for循环完成九九乘法表的输出
 * @Data: Created on 2018-11-27 16:14
 */
public class Practice_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}
