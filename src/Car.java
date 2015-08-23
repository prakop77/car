/**
 * Created by teacher on 23.08.2015.
 */
public class Car {
    String CarName;
    Size CarSize;
    int color;
    int speed

}
    public Car (String CarName,Size CarSize,int color) {
        this.CarName = CarName;
        this.CarSize = CarSize;
        this.color = color;
    }
    public void turnOn() {
        System.out.println("TurnOn Car " + CarName);
        if(speed == 0) System.out.println("We Can Go!!!")
        ;
    }

    public void turnOff() {
        System.out.println("TurnOff Car " + CarName);
    }
    public void move() {
        if (speed > 0) System.out.println("We Are Moving!!!");
    }
