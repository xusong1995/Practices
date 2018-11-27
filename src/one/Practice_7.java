package one;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 抓球问题：有红球5个，黑球7个，白球9个，随机取出12个，计算可能的颜色组合有多少种
 * @Data: Created on 2018-11-27 15:38
 */
public class Practice_7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                for (int k = 0; k < 9; k++) {
                    if (i + j + k == 12) {
                        count++;
                    }
                }
            }
        }
        System.out.println("可能的颜色组合有" + count + "种");
    }
}
