package chapters.chapter07.Exercise07;

public class Exercises07_23 {

    /*
     -ilk durumda tüm kapılar kapalı
     -every student  make change on lockers
      - print finally open doors
     */
    public static void main(String[] args) {

        boolean[] door = new boolean[100]; // ilk durumda hepsi false(kapalı) default olarak
        int numberOfStudent = 100;

        changeTheLockers(door, numberOfStudent);
        printOpenDoor(door);

    }

    public static void printOpenDoor(boolean[] door) {  //arraydaki true'ların ındexi yazılıyor yani açık kapılar
        for (int i = 0; i < door.length; i++) {
            if(door[i]){
                System.out.print((i+1) + " ");
            }

        }
    }
        //false --> closed doors
       //true --> open doors
    public static void changeTheLockers(boolean[] door, int numberOfStudent) {
        for (int i = 1; i < numberOfStudent; i++) {
            for (int j = i - 1; j < door.length; j+=i) {
                door[j] = door[j] ? false  :  true ; //eşitlikte kapı kapalı anlıyorum

            }

        }
    }


}
