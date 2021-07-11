package id.ten.practice.week1.designPattern.behaviouralPattern.commnad;

/**
 * Package: id.ten.practice.week1.designPattern.behaviouralPattern.commnad
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 11:30 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();
    }
}
