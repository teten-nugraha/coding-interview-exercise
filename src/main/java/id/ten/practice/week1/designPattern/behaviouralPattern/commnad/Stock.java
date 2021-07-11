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
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
