package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 统计字符：从键盘输入一个字符串，统计这个字符串当中包含几个大写字母，几个小写字母，几个数字，几个特殊符号
 * @Data: Created on 2018-11-27 14:24
 */
public class Practice_6 {
    public static void main(String[] args) {
        //数字计数器
        int num = 0;
        //大写字母计数器
        int arabicAlphabet = 0;
        //小写字母计数器
        int lowercaseLetter = 0;
        //符号计数器
        int symbol = 0;
        //输入字符串并保存
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //将输入的字符串转存至字符数组中
        char strArray[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = str.charAt(i);
        }

//        for (int i = 0;i<strArray.length;i++) {
//            System.out.println(strArray[i]);
//        }

        //从字符数组中逐个取出，逐个判断
        for (int j = 0; j < strArray.length; j++) {
            if (strArray[j] >= 48 && strArray[j] <= 57) {
                num++;
            } else if (strArray[j] >= 65 && strArray[j] <= 90) {
                arabicAlphabet++;
            } else if (strArray[j] >= 97 && strArray[j] <= 122) {
                lowercaseLetter++;
            } else {
                symbol++;
            }
        }
        System.out.println("大写字母有" + arabicAlphabet + "个");
        System.out.println("小写字母有" + lowercaseLetter + "个");
        System.out.println("数字有" + num + "个");
        System.out.println("符号有" + symbol + "个");
    }
}
