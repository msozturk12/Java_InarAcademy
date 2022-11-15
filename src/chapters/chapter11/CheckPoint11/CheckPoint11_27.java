package chapters.chapter11.CheckPoint11;

public class CheckPoint11_27 {
    public static void main(String[] args) {
        Object fruit = new Fruit();  //There is a one Object it is fruit
        Object apple = (Apple) fruit; //CLassCastingException
    }
}

class Apple extends Fruit {
}

class Fruit {
}

