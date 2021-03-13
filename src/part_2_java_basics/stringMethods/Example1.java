package part_2_java_basics.stringMethods;

public class Example1 {
    public static void main(String[] args) {

        String string1 = "I like coffee";
        String string2 = new String("I like coffee");
        System.out.println("string1 == string2 = " + (string1 == string2));

        String string3 = string2;
        System.out.println("string2 == string3 = " + (string2 == string3));

        String string4 = "I like coffee!!!";
        String substring = string4.substring(0, 13);
        System.out.println("substring = " + substring);
        System.out.println("string1 == substring = " + (string1 == substring));

        System.out.println("substring.toLowerCase() = " + substring.toLowerCase());
        System.out.println("substring.toUpperCase() = " + substring.toUpperCase());


    }
}
