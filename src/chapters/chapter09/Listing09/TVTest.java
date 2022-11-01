package chapters.chapter09.Listing09;

public class TVTest {

    public static void main(String[] args) {
        TV tv1 = new TV(20, 5, true);
        tv1.print();

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeUp();
        tv2.channelDown();
        tv2.print();
        System.out.println("---------------------");
        tv2.setChannel(32);
        tv2.setVolume(6);
        tv2.print();
    }


}
