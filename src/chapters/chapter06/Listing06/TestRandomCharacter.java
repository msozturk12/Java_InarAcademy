package chapters.chapter06.Listing06;

public class TestRandomCharacter {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacters.getRandomCharacter('a', 'z') + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacters.getRandomUpperCase() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(RandomCharacters.getRandomCharacter() + " ");
        }
    }
}