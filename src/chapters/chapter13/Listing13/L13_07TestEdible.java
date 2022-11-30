package chapters.chapter13.Listing13;

public class L13_07TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                Edible e = ((Edible) objects[i]);
                System.out.println(e.howToEat());
            }
            if (objects[i] instanceof Animal) {
                Animal a = ((Animal) objects[i]);
                System.out.println(a.sound());
            }
        }
    }
}

abstract class Animal {
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: FRY it";
    }

    @Override
    public String sound() {
        return "Chicken : cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger : ROOOAAAR";
    }
}

abstract class Fruit implements Edible {
    // Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {

    @Override
    public String howToEat() {
        return "Apple:Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "orange:make orange juice";
    }
}
