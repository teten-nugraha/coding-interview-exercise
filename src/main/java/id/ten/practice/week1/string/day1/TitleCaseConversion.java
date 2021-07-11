package id.ten.practice.week1.string.day1;

/**
 * Package: id.ten.practice.week1.string.day1
 * <p>
 * User: TetenNugraha
 * Date: 7/5/2021
 * Time: 3:03 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class TitleCaseConversion {
    public static void main(String[] args) {
        final String value = "i love you so much";
        final String result = getTitleCase(value);
        System.out.println(result);
    }

    private static String getTitleCase(String value) {
        final char[]c = value.toCharArray();
        for (int i = 0; i < value.length()-1; i++) {
            if(i == 0) {
                c[i] = Character.toUpperCase(c[i]);
            }
            if(c[i] == ' ') {
                c[i+1] = Character.toUpperCase(c[i+1]);
            }
        }
        return String.valueOf(c);
    }
}
