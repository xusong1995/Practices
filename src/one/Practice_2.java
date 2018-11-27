package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 字符判断：从键盘输入一个字符，判断这个字符是数字，还是大写字母，还是小写字母，还是符号
 * @Data: Created on 2018-11-27 12:36
 */
public class Practice_2 {
    public static void main(String[] args) {

        /*ASCII码：48~57为10个阿拉伯数字
        65~90为26个大写英文字母
        97~122为26个小写英文字母
        其余为一些符号
         */

        Scanner sc = new Scanner(System.in);
        //只取第一个字符
        char c = sc.next().charAt(0);
        if (c >= 48 && c <= 57) {
            System.out.println("输入的是阿拉伯数字");
        } else if (c >= 65 && c <= 90) {
            System.out.println("输入的是大写英文字母");
        } else if (c >= 97 && c <= 122) {
            System.out.println("输入的是小写英文字母");
        } else {
            System.out.println("输入的为符号");
        }
    }
}
