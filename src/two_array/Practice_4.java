package two_array;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 创建一维数组，实现随机打乱一个数组
 * @Data: Created on 2018-11-29 15:05
 */
public class Practice_4 {
    public static void main(String[] args) {
        int temp = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //创建一个数组，保存打乱后的数
        int[] newArray = new int[array.length];
        System.out.println("数组为：");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            //产生一个[0,array.length]之间的数
            temp = (int) (Math.random() * (array.length));
            //把array[i]中的数放到array[temp]中
            newArray[temp] = array[i];
            if (newArray[temp] != 0) {
                temp = (int) (Math.random() * (array.length));
                newArray[temp] = array[i];
            }
        }
        System.out.println("打乱后的数组为：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
