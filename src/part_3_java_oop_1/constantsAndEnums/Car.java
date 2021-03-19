package part_3_java_oop_1.constantsAndEnums;

public class Car {

    private int speed;
    private Size size;

    public Car(int speed, Size size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
