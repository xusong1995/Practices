package one;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 组合问题：用1元纸币兑换1分，2分和5分的硬币，要求兑换总数为50枚，问可以有多少种组合，每种组合对用1分，2分，5分分别为多少。
 * @Data: Created on 2018-11-27 15:58
 */
public class Practice_8 {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 0; a < 50; a++) {
            for (int b = 0; b < 50; b++) {
                for (int c = 0; c < 50; c++) {
                    if (a * 1 + b * 2 + c * 5 == 100 && a + b + c == 50) {
                        System.out.println("1分为" + a + "个，" + "2分为" + b + "个，" + "3分为" + c + "个。");
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("一共有" + count + "种组合");
    }
}
