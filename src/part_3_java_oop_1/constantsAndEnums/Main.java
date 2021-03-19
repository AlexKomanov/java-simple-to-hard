package part_3_java_oop_1.constantsAndEnums;

public class Main {

    public static void main(String[] args) {

        System.out.println("Constants.MIN_SPEED = " + Constants.MIN_SPEED);

        Car car = new Car(Constants.MAX_SPEED, Size.VERY_BIG);
        System.out.println(Size.VERY_SMALL.getAbbreviation());

        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value.getAbbreviation());
            System.out.println(value.name());
        }


    }
}
