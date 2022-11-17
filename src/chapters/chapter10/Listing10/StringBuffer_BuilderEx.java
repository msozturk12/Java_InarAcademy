package chapters.chapter10.Listing10;

public class StringBuffer_BuilderEx {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Welcome");
        sb.append(' ');
        sb.append("to");
        sb.append(' ');
        sb.append("Java");
        sb.insert(11, "HTML and ");

        sb.delete(8, 11);
        System.out.println("sb.delete(8,11)--> " + sb.toString());
        sb.deleteCharAt(8);
        System.out.println("sb.deleteCharAt(8)--> " + sb.toString());

        sb = new StringBuilder("Ali Ata Bak");
        sb.reverse();
        System.out.println(sb);
        sb.replace(11, 15, "HTML");

        sb.setCharAt(0, 'w');
        System.out.println(sb.toString());

        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
