package weeks.week_12.Football;

public class FootballClub {

    private long balance;
    private String clubName;
    private double ticketFee;
    private String stadium;
    private int stadiumCapacity;
    private Player[] team;


    public FootballClub() {

        this(0, "default", 0, " ", 0, new Player[25]);
    }

    public FootballClub(String clubName, String stadium) {
        this(0, clubName, 0, stadium, 0, new Player[25]);

        // this.clubName = clubName;
        // this.stadium = stadium;

    }

    public FootballClub(long balance, String clubName, double ticketFee, String stadium, int stadiumCapacity, Player[] players) {

        this.balance = balance;
        this.clubName = clubName;
        this.ticketFee = ticketFee;
        this.stadium = stadium;
        this.stadiumCapacity = stadiumCapacity;
        this.team = players;


    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;

    }

    public double getTicketFee() {
        return ticketFee;
    }

    public void setTicketFee(double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    public Player[] getTeam() {
        return team;
    }

    public void setTeam(Player[] team) {
        this.team = team;
    }

    public void sellTicket(int soldTicketNumber) {
        soldTicketNumber = soldTicketNumber > this.stadiumCapacity ? this.stadiumCapacity : soldTicketNumber;
        this.balance = (long) (soldTicketNumber * this.ticketFee);

    }

    public void sellPlayer(Player p) {
        if (doPlayerExistInMyTeam(p)) {
            this.balance = this.balance + p.getFee();
            removePlayer(p);
            System.out.println("You sold " + p.getName().toUpperCase());
            printBalance();
        } else {
            System.out.println(p.getName() + " does not exist in this team");
        }

    }

    public void buyPlayer(Player p) {
        if (doWeHaveEnoughPlaceInTeam()) {
            if (this.balance < p.getFee()) {
                System.out.println("Your balance only :" + this.balance);
                System.out.println(p.getName() + " cost is " + p.getFee());
                System.out.println("TOO BROKE!!! YOU CAN'T BUY");
                return;
            }
            this.balance = this.balance - p.getFee();
            System.out.println("You bought " + p.getName().toUpperCase());
            addPlayer(p);
            printBalance();
        }
    }

    private boolean doWeHaveEnoughPlaceInTeam() {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if (myPlayer == null) {
                return true;
            }

        }
        return false;

    }

    public boolean doPlayerExistInMyTeam(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if (myPlayer == null) {
                continue;
            }
            if (myPlayer.getName().equals(p.getName())) {
                return true;
            }

        }
        return false;
    }

    public void removePlayer(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if (myPlayer.getName().equals(p.getName())) {
                team[i] = null;
                break;
            }
        }
    }

    public void addPlayer(Player p) {
        for (int i = 0; i < this.team.length; i++) {
            Player myPlayer = team[i];
            if (myPlayer == null) {
                team[i] = p;
                break;

            }

        }
    }

    public void printBalance() {
        System.out.println("BALANCE :" + this.balance);
        System.out.println("--------------");

    }
}
