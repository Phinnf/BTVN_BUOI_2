public class TimeConservation {

    public int phut60bang1gio = 60;
    public int gio24bang1ngay = 24;

    public int ConvertHourToMin(int hours) {
        return phut60bang1gio * hours;
    }
    public int ConvertDaysToMin(int days) {
        return gio24bang1ngay * phut60bang1gio * days;
    }
}
