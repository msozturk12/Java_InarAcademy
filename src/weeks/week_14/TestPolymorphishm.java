package weeks.week_14;

public class TestPolymorphishm {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal lion = new Lion();

        System.out.println("lion.toString() \n" + lion.toString());
        System.out.println("------------------");
        System.out.println("animal.toString() \n" + animal.toString());

        //Declaration type-->you can call only declared type's methods
        System.out.println("(Lion)lion).getTailSize()--> " + ((Lion) lion).getTailSize());

        //Actual type -> once you compile the code, JAVA will start
        //              searching starting from actual type
        lion.toString();
        System.out.println((((Lion)animal).getTailSize()));//ClassCastException
        lion.toString();

    }
}
