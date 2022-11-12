package chapters.chapter10.Exercises10.Exercise10_24;

public class MyCharacterTest {
    public static void main(String[] args) {

        MyCharacter a = new MyCharacter('z');
        System.out.println( MyCharacter.getValueOf(a));

        System.out.println("MyCharacter.isLetter('%')-->"+MyCharacter.isLetter('%'));
        System.out.println("MyCharacter.isDigit('5')-->"+MyCharacter.isDigit('5'));
        System.out.println("MyCharacter.isLetterOrDigit('O')-->"+MyCharacter.isLetterOrDigit('O'));

        System.out.println("MyCharacter.toUpperCase('y')-->"+MyCharacter.toUpperCase('y'));
        System.out.println("MyCharacter.toLowerCase('M')-->"+MyCharacter.toLowerCase('M'));

        System.out.println("MyCharacter.isUpperCase('Z')-->"+MyCharacter.isUpperCase('Z'));
        System.out.println("MyCharacter.isUpperCase('e')-->"+MyCharacter.isUpperCase('e'));
        System.out.println("MyCharacter.isLowerCase('y')-->"+MyCharacter.isLowerCase('y'));
        System.out.println("MyCharacter.isLowerCase('N')-->"+MyCharacter.isLowerCase('N'));

        MyCharacter mc = new MyCharacter('D');
        System.out.println("a.toCompare(mc)-->"+a.toCompare(mc));



    }
}
