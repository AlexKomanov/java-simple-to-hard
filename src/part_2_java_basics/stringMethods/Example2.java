package part_2_java_basics.stringMethods;

public class Example2 {
    public static void main(String[] args) {

        String string1 = "I like coffee";
        String string4 = "I like coffee!!!";
        String substring = string4.substring(0, 13);

        System.out.println("substring == string1 = " + (substring == string1));

        System.out.println("substring.equals(string1) = " + substring.equals(string1));

        System.out.println("substring.startsWith(\"I like\") = " + substring.startsWith("I like"));
        System.out.println("substring.startsWith(\"like\", 2) = " + substring.startsWith("like", 2));
        System.out.println("substring.endsWith(\"coffee\") = " + substring.endsWith("coffee"));
    }
}
