package chapters.chapter10.CheckPoints10;

public class CheckPoint10_17_18 {

    public static void main(String[] args) {
        String a1 = "Welcome to Java";
        String a2 = a1.replace("o", "abc");
        System.out.println(a1);//Welcome to Java
        System.out.println(a2);//Welcabcme tabc Java

        System.out.println("\n\n--------Checkpoint-10_18----------------------------");

        String s1 = "Welcome";
        String s2 = "Welcome";
        s2 = s1.replaceAll("e", "E");
        System.out.println(s2);

        String str = "Welcome to java and HTML";
        String[] tokens = str.split(" ");
        s1 = tokens[0];
        s2 = tokens[1];


    }


}
