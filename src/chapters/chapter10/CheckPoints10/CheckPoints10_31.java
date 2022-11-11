package chapters.chapter10.CheckPoints10;

public class CheckPoints10_31 {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");

        s1.append(" is fun");
        s1.append(s2);
        s1.insert(2,"is fun");
        s1.insert(1,s2);
        System.out.println(s1.toString());

        StringBuilder s3 = new StringBuilder("Java");


        s3.charAt(2);//v
        s3.length();//1
        s3.deleteCharAt(3);//Jav
        s3.delete(1,3);//J
        System.out.println(s3);

        StringBuilder s4 = new StringBuilder("HTML");
        s4.reverse();
        s4.replace(1,3,"Computer");
        System.out.println(s4);

        StringBuilder s5 = new StringBuilder("Inar Academy");

        System.out.println(s5.substring(1,3));//na

        System.out.println( s5.substring(2));//ar Academy


    }
}
