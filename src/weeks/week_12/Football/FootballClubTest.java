package weeks.week_12.Football;

public class FootballClubTest {
    public static void main(String[] args) {
        Player messi = new Player("Messi", 20_000_000);
        Player ronaldo = new Player("Ronaldo", 4_000_000);
        Player maguire = new Player("Maguire", 12_000);
        Player neymar = new Player("Neymar", 8_000_000);
        Player iniesta = new Player("Iniesta", 15_000_000);
        Player haaland = new Player("Haaland", 18_000_000);
        Player veli = new Player("Veli", 100);
        Player olcay = new Player("Olcay", 50);

        FootballClub sparta_club = new FootballClub(40_000_001, "SpartaSpor", 10, "roseStadium", 15000, new Player[5]);
        sparta_club.buyPlayer(messi);
        sparta_club.buyPlayer(iniesta);
        sparta_club.buyPlayer(haaland);
        sparta_club.buyPlayer(neymar);
        sparta_club.buyPlayer(ronaldo);

        sparta_club.sellPlayer(messi);

        sparta_club.buyPlayer(olcay);
        sparta_club.buyPlayer(veli);
        sparta_club.buyPlayer(maguire);

        System.out.println(sparta_club.getBalance());


    }
}
