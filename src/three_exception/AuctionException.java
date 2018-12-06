package three_exception;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: 自定义一个异常类
 * @Data: Created on 2018-12-05 18:03
 */
public class AuctionException extends Exception {
    //自定义异常类时通常需要提供两个构造器：一个是无参数的构造器，另一个是带一个字符串参数的构造器
    //这个字符串是将作为该异常对象的描述信息（也就是异常对象的getMessage()方法的返回值）

    //无参数的构造器
    public AuctionException() {

    }

    //带一个字符串参数的构造器
    public AuctionException(String msg) {
        super(msg);
    }
}
