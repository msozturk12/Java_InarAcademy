package weeks.week_15.Exceptions.MyException;

public class Coffee {

    private String type;
    private int temp;

    public Coffee(String type) {
      this("Regular",0);
    }

    public Coffee(String type, int temp) {
        this.type = type;
        this.temp = temp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
