package chapters.chapter13.Checkpoints13;

public class CheckPoints13_17_18_19_20_21 {


    /*
    CheckPoints13_17-->
        True or false? If a class implements Comparable, the object of the class can invoke
        the compareTo method.-->YES

    CheckPoints13_18-->
        Which of the following is the correct method header for the compareTo method in
        the String class?
        public int compareTo(String o)-->this is correct
        public int compareTo(Object o)

    CheckPoints13_19-->
       Integer n1 = new Integer(3);
        Object n2 = new Integer(4);
        System.out.println(n1.compareTo(n2));

        -->compareTo method require an Integer argument,but n2 is declared as Object.
        The compiler will give an error.

        Integer n1 = new Integer(3);
        Object n2 = new Integer(4);
        System.out.println(n1.compareTo((Integer) n2)); you have to cast n2 to Integer

    CheckPoints13_20-->
           You can define the compareTo method in a class without implementing the Comparable interface.
            What are the benefits of implementing the Comparable interface?
                -->By implementing the Comparable interface, the object of the class can be passed to a method that requires a Comparable type.

      CheckPoints13_21-->
                Person[] persons = {new Person(3), new Person(4), new Person(1)};
                java.util.Arrays.sort(persons);
            }
        }
        class Person {
            private int id;
            Person(int id) {
                this.id = id;    -->ClassCastingException
                -------------->The Person class does not implement the Comparable interface, two persons can not be compared using the compareTo method.
     */
}
