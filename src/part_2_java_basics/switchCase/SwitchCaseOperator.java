package part_2_java_basics.switchCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseOperator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose a day of the week: ");
        String dayOfTheWeek = reader.readLine();

        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("It's a first working day.");
                break;
            case "tuesday":
                System.out.println("It's a second working day.");
                break;
            case "wednesday":
                System.out.println("It's a third working day.");
                break;
            case "thursday":
                System.out.println("It's a fourth working day.");
                break;
            case "friday":
                System.out.println("It's a fifth working day.");
                break;
            case "saturday": case "sunday":
                System.out.println("It's a WEEKEND!");
                break;
            default:
                System.out.println("It's not a day of the week!");

        }

    }
}
