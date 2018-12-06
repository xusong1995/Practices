package three_exception;

/**
 * @Program: Practices
 * @Author: XuSong
 * @Description: catch和throw同时使用
 * @Data: Created on 2018-12-05 17:48
 */
public class AuctionTest {
    private  double initPrice = 30.0;

    public void bid(String bidPrice) throws AuctionException{
        double d = 0.0;
        try{
            d = Double.parseDouble(bidPrice);
        }catch (Exception e) {
            throw new AuctionException("竞拍价必须是数值，不能包含其他字符");
        } if (initPrice > d) {
            throw new AuctionException("竞拍价比起拍价低，不允许竞拍！");
        }
        initPrice = d;
    }

    public static  void main(String[] args) {
        AuctionTest at = new AuctionTest();
        try {
            at.bid("20.0");
        } catch (AuctionException ae) {
            System.err.println(ae.getMessage());
        }
    }
}
