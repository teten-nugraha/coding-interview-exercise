package id.ten.practice.week1.designPattern.behaviouralPattern.commnad;

/**
 * Package: id.ten.practice.week1.designPattern.behaviouralPattern.commnad
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 11:26 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
