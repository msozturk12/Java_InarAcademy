package weeks.week_12.student;

public class TestStudent {


    public static void main(String[] args) {

       Student week = new Student();
        System.out.println(week.ACADEMY);

        Student ali = new Student("Ali", "Ata", 2112, "msn");
        ali.setId(4214);
        ali.setEmail("gmail");
        ali.print();

        int id = ali.getId();
        System.out.println("id of ali " + id);

        Student veli = new Student("veli", "çakal", 456, "yahoo");
        veli.print();

        Student sara = new Student("sara", "ozturk", 695, "insta");
        String name = sara.getName();
        System.out.println("Sara's name :" + name);
        sara.print();


        System.out.println("STUDENT NUMBER ="+ Student.getStudentCounter() );

        Student nihal = new Student();
        System.out.println(nihal.defaultAccessModifier);
        System.out.println(nihal.protectedAccessModifier);
    }

}
