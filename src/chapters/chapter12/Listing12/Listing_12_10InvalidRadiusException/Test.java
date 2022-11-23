package chapters.chapter12.Listing12.Listing_12_10InvalidRadiusException;

public class Test {
    public static void main(String[] args) {
        try{
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);

        }catch (InvalidRadiusException ex){
            System.out.println(ex);
        }
        System.out.println("Number of object created: " + CircleWithCustomException.getNumberOfObject());
    }
}
