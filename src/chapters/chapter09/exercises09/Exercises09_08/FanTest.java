package chapters.chapter09.exercises09.Exercises09_08;

public class FanTest {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);
        System.out.println(fan.toString());

        System.out.println("----------------------");

        Fan fan2 = new Fan();
        fan.setSpeed(Fan.MEDIUM);
        fan.setRadius(5);
        fan.setColor("blue");
        fan.setOn(false);
        System.out.println(fan.toString());


    }


}
