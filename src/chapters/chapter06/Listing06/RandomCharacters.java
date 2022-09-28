package chapters.chapter06.Listing06;

public class RandomCharacters {

    public static char getRandomCharacter(char ch1, char ch2) {

        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomUpperCase(){
        return getRandomCharacter('a','z');
    }

    public static char getRandomLowerCase(){
        return getRandomCharacter('A','Z');

    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');

    }

    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000','\uFFFF');
    }
}

