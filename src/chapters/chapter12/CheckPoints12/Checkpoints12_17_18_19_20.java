package chapters.chapter12.CheckPoints12;

public class Checkpoints12_17_18_19_20 {

    /*
CheckPoints12_17-->
        getMessage():describe the Exception

CheckPoints12_18-->
        printStackTrace() : it gives trace info

CheckPoints12_19-->
        Does the presence of a try-catch block impose overhead when no exception occurs? --> NO

CheckPoints12_20-->
        public void m(int value) {
                if (value < 40){
                        throw new Exception("value is too small");
                }
        }

  The method throws a checked exception. It must be caught or thrown. You may fix it as follows:
        public void m(int value) throw Exception{
            if (value < 40){
                throw new Exception("value is too small");
            }
        }

     */


}
