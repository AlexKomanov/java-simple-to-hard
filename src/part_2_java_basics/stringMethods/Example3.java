package part_2_java_basics.stringMethods;

public class Example3 {
    public static void main(String[] args) {

        String string1 = "I like a black coffee";
        System.out.println(string1.replace("black", "white"));

        System.out.println("string1.indexOf(\"coffee\") = " + string1.indexOf("coffee"));
        System.out.println("string1.indexOf(\"sdfsdfsdfd\") = " + string1.indexOf("ssssss"));
    }
}
