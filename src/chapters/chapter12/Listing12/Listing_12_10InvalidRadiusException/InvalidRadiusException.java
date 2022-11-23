package chapters.chapter12.Listing12.Listing_12_10InvalidRadiusException;

public class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException( double radius) {
        super("Invalid radius-->" + radius);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
