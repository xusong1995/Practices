package one;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 密码验证：尝试将用户名和密码验证分开进行，即如果用户名输入错误，则不需要再提示输入密码，只有当用户名正确的情况下
 * 再提示输入密码
 * @Data: Created on 2018-11-27 13:07
 */
public class Practice_3 {
    public static void main(String[] args) {
        String username = "许松";
        String password = "1234";
        //用户名输错3次程序退出
        for (int i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String input_username = scanner.nextLine();
            if (input_username.equals(username)) {
                System.out.println("用户名输入正确，请输入密码：");
                break;
            } else {
                System.out.println("用户名输入错误");
                if (i==3) {
                    System.exit(-1);
                }
            }
        }
        //密码输入错误3次程序自动退出
        for (int j = 1; j <= 3; j++) {
            Scanner scanner = new Scanner(System.in);
            String input_Password = scanner.nextLine();
            if (input_Password.equals(password)) {
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("密码输入错误");
            }
        }
    }
}
