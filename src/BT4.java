public class BT4 {
    public static void main(String[] args) {
        TimeConservation phut = new TimeConservation();
        int ConvertHourToMin = phut.ConvertHourToMin(2);
        System.out.printf("So phut la: %d", ConvertHourToMin);
        int ConvertDaysToMin = phut.ConvertDaysToMin(3);
        System.out.printf("\nSo phut la: %d ", ConvertDaysToMin);
    }
}
