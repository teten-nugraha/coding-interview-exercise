package id.ten.practice.week1.designPattern.creationalPattern.factoryMethod;

/**
 * Package: id.ten.practice.week1.designPattern.creationalPattern.factoryMethod
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 9:49 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
