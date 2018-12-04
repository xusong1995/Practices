package two_array;

import java.util.Scanner;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 消息加密的办法是：对消息原文中的每个字母，分别用该字母之后的第5个字母替换
 * （例如：消息原文中的每个字母A都分别替换成字母F）。而你要获得消息原文，也就是要将这个过程反过来。
 * 密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
 * 原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U 
 * 注意：只有字母会发生替换，其他非字母的字符不变，并且消息原文的所有字母都是大写的。
 * @Data: Created on 2018-11-29 14:41
 */
public class Practice_3 {
    public static void main(String[] args) {
        System.out.println("请输入消息：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] message = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            message[i] = s.charAt(i);
        }
        System.out.println("输入的消息为：");
        for (int i = 0; i < message.length; i++) {
            System.out.print(message[i]);
        }
        System.out.println();
        System.out.println("加密后的消息为：");
        for (int i = 0; i < message.length; i++) {
            if (message[i] >= 65 && message[i] <= 90) {
                message[i] += 5;
            }
            System.out.print(message[i]);
        }
    }
}
