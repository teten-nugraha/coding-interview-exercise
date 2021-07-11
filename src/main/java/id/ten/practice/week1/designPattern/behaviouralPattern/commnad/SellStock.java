package id.ten.practice.week1.designPattern.behaviouralPattern.commnad;

/**
 * Package: id.ten.practice.week1.designPattern.behaviouralPattern.commnad
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 11:28 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
