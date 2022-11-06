package weeks.week_13;

public class HomeTest {
    public static void main(String[] args) {
        System.out.println("----Default home----");
        Home home = new Home();
        home.printHome();

        System.out.println("\n----Home1----");
        Home home1 = new Home(150, 1, 3, false, 50_000, 1500, "North", 2015);
        home1.printHome();


        Home home2 = new Home();
        home2.setFront("South");
        home2.setGarage(true);
        home2.setSquareMeter(250);
        home2.setYear(2020);
        home2.printHome();

        Home redmondHouse = new Home(300,7,4,true,1_000_000,7000,"Four fronted",1960);
        redmondHouse.printHome();
        redmondHouse.renovasyon();
        redmondHouse.printHome();


    }
}
