package weeks.week_13;

public class Home {
    private double squareMeter;
    private int numberOfBath;
    private int numberOfRoom;
    private boolean garage;
    private long houseFee;

    private long rentFee;
    private String front;
    private int year;

    public Home() {
        this(0, 0, 0, false, 0, 0, "default", 1789);
        //default values

    }

    public Home(double squareMeter, int numberOfBath, int numberOfRoom, boolean garage, long feeOfHouse, long feeOfRent, String front, int year) {
        this.squareMeter = squareMeter;
        this.numberOfBath = numberOfBath;
        this.numberOfRoom = numberOfRoom;
        this.garage = garage;
        this.houseFee = feeOfHouse;
        this.rentFee = feeOfRent;
        this.front = front;
        this.year = year;

    }

    public Home(double squareMeter,int numberOfRoom,long houseFee,long rentFee,int year) {
        this(squareMeter,1,numberOfRoom,false,houseFee,rentFee,"default",year);

    }

    public double getSquareMeter() {
        return this.squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getNumberOfBath() {
        return this.numberOfBath;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public int getNumberOfRoom() {
        return this.numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public long getHouseFee() {
        return houseFee;
    }

    public void setHouseFee(long houseFee) {
        this.houseFee = houseFee;
    }

    public long getRentFee() {
        return rentFee;
    }

    public void setRentFee(long rentFee) {
        this.rentFee = rentFee;
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void renovasyon(){
        this.houseFee = (int)(this.houseFee * 1.1);
        this.rentFee = (int)(this.rentFee * 1.6);
    }
    public void printHome() {
        System.out.println("--------------Home Details------------------");
        System.out.println("Squaremeter of house --> " + this.squareMeter);
        System.out.println("Number of bath is --> " + this.numberOfBath);
        System.out.println("Number of room is --> " + this.getNumberOfRoom());
        System.out.println("is there garage --> " + this.garage);
        System.out.println("House fee --> " + this.houseFee);
        System.out.println("House's rent fee --> " + this.rentFee);
        System.out.println("House front is --> " + this.front);
        System.out.println("The age of house --> " + this.year);
        System.out.println("---------------------------------------------");
    }
}
