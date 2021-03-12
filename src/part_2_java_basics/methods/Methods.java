package part_2_java_basics.methods;

public class Methods {
    public static void main(String[] args) {

        printName("Alexander");
        int areaOfRectangle = rectangleArea(5, 10);
        int areaOfSquare = squareArea(10);

        System.out.println("areaOfSquare = " + areaOfSquare);
        System.out.println("areaOfRectangle = " + areaOfRectangle);

        int sumOfAreas = areaOfRectangle + areaOfSquare;

        System.out.println("sumOfAreas = " + sumOfAreas);

    }

    public static void printName(String name) {
        System.out.println("The name is " + name);
    }

    public static int rectangleArea(int a, int b) {
        return a * b;
    }

    public static int squareArea(int a) {
        return a * a;
    }
}
