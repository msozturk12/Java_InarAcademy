package chapters.chapter11.Exercises11.Exercise11_02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Mesut", "Amsterdam 23-566", "5667894578", "msozturk@ınar.edu.tr");
        System.out.println(p1);

        Student s1 = new Student("Sare","Paris 569-56","0326589784","sare32@gmail",Student.SOPHOMORE);
        System.out.println(s1);

        Employee e1 = new Employee("Ebubekir","Kayseri 123-23","08476548798","EbıMızrak@ınar.edu",
                "Avukat189",45000,new MyDate());
        System.out.println(e1);

        Faculty f1 = new Faculty("Berk","Dubai 536-96","23-98745",
                "superBB@ınar","SDET214",65000,new MyDate(),7,"Debutant");
        System.out.println(f1);

        Staff staff = new Staff("Altun","texas32-56","4123-6545",
                "proAltun@itu.edu","pclab-201",65000,new MyDate(),"CTO");
        System.out.println(staff);
    }


}
