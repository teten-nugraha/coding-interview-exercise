package id.ten.practice.week1.designPattern.behaviouralPattern.commnad;

import java.util.ArrayList;
import java.util.List;

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
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrder() {
        for(Order order: orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
