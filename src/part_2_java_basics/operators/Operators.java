package part_2_java_basics.operators;

public class Operators {
    public static void main(String[] args) {

        double m = 7;
        double n = 7;

        double res = 2 * m++;
        double res2 = 2 * ++n;

        System.out.println("res = " + res);
        System.out.println("res2 = " + res2);
    }
}
