package one;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 循环求和：利用循环语句计算从100加到500后的总和
 * @Data: Created on 2018-11-27 12:29
 */
public class Practice_1 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 100; i <= 500; i++) {
            j = i + j;
        }
        System.out.println("从100加到500的总和为：" + j);
    }
}
