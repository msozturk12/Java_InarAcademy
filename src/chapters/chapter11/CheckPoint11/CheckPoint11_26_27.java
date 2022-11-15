package chapters.chapter11.CheckPoint11;

public class CheckPoint11_26_27 {
    /*
    Fruit fruit = new GoldenDelicious();
    Orange orange = new Orange();

Answer the following questions:
a. Is fruit instanceof Fruit?    --->true
b. Is fruit instanceof Orange?  ---->false
c. Is fruit instanceof Apple?    --->true
d. Is fruit instanceof GoldenDelicious? -->true
e. Is fruit instanceof McIntosh?----------->false
f. Is orange instanceof Orange? ------------>true
g. Is orange instanceof Fruit? -------------->true
h. Is orange instanceof Apple?--------------->false
i. Suppose the method makeAppleCider is defined in the Apple class.
                     Can fruit invoke this method? ------>no ...cast yapılabilirdi ((Apple)fruit).makeAppleCider()
                     Can orange invoke this method?------>no
j. Suppose the method makeOrangeJuice is defined in the Orange class.
            Can orange invoke this method?-->yes
            Can fruit invoke this method?--->no

k. Is the statement Orange p = new Apple() legal? ----no
l. Is the statement McIntosh p = new Apple() legal? --no büyük tip küçük tipe atayamayız
m. Is the statement Apple p = new McIntosh() legal? --legal
     */

    /*
     public class Test {
 public static void main(String[] args) {
 Object fruit = new Fruit();  //There is a one Object it is fruit
 Object apple = (Apple)fruit; //CLassCastingException
 }
 }

 class Apple extends Fruit {
 }

 class Fruit {
 }
     */
}
