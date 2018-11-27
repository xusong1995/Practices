package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 水仙花数：计算三位整数（100~999）的水仙花数。水仙花数是指每一位的立方相加等于该数自己
 *               比如：153 = 1^3 + 5^3 + 3^3
 * @Data: Created on 2018-11-27 13:41
 */
public class Practice_4 {
    public static void main(String[] args) {
//        System.out.println("请输入一个三位整数（100~999）：");
////        Scanner scanner = new Scanner(System.in);
////        int num = scanner.nextInt();
//        int firstNum = num/100;
//        int seconNum = (num%100)/10;
//        int thirdNum = (num%100)%10;

//        System.out.println(firstNum);
//        System.out.println(seconNum);
//        System.out.println(thirdNum);

        int num = 0;
        for (num = 100;num<=999;num++) {
            int firstNum = num/100;
            int secondNum = (num%100)/10;
            int thirdNum = (num%100)%10;
            if (num == Math.pow(firstNum,3) + Math.pow(secondNum,3) + Math.pow(thirdNum,3)) {
                System.out.println(num);
            }
        }
    }
}
