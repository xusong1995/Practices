package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 字符串判断：从键盘输入一个字符串，判断该字符串是否可以被转换为一个有效的数字
 * @Data: Created on 2018-11-27 16:26
 */
public class Practice_10 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
      try {
          double d = Double.parseDouble(str);
          System.out.println("可以转换，转换后的数字为：" + d);
        }catch (NumberFormatException e){
          System.out.println("不可以转换");
      }
    }
}
