package chapters.chapter02;

public class Exercise_08 {
	public static void main(String[] args) {

		long totalMiliSecond = System.currentTimeMillis();
		System.out.println("totalMiliSecond " + totalMiliSecond);

		long totalSecond = totalMiliSecond / 1000;
		System.out.println("totalSecond " + totalSecond);

		long currentSecond = totalSecond % 60;
		System.out.println("currentSecond " + currentSecond);

		long totalMinute = totalSecond / 60;
		System.out.println("totalMinute " + totalMinute);

		long currentMinute = totalMinute % 60;
		System.out.println("currentMinute " + currentMinute);

		long totalHour = totalMinute / 60;
		System.out.println("currentMinute " + currentMinute);

		long currentHour = totalHour % 24;
		System.out.println("currentHour " + currentHour);

		System.out.println("currentTime is : " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT ");

	}

}
