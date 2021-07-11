package id.ten.practice.week1.designPattern.creationalPattern.factoryMethod;

/**
 * Package: id.ten.practice.week1.designPattern.creationalPattern.factoryMethod
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 9:51 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Demo {
    public static void main(String[] args) {
        String chooseButton="html";
        Button button;
        if(chooseButton.equalsIgnoreCase("window")){
            button = new WindowsButton();
        }else{
            button = new HtmlButton();
        }

        button.render();
    }
}
