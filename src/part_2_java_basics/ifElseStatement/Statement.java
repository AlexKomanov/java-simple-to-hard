package part_2_java_basics.ifElseStatement;

public class Statement {
    public static void main(String[] args) {

        int testScore = 90;
        System.out.println("You've got ");
        if(testScore >= 90){
            System.out.println("An Excellent ");
        }
        else if(testScore >= 60){
            System.out.println("A Good ");
        }
        else {
            System.out.println("A bad");
        }
        System.out.println("Mark.");
    }
}
