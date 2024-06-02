public class BT1 {
    public static void main(String[] args) throws Exception {

        System.out.println("Bai tap 1:");
        Person person = new Person();
        person.born = 2004;
        int tuoi = person.age();
        System.out.printf("So tuoi la %d", tuoi);

        System.out.println("\n\nBai tap 2:");
        Circle hinhtron = new Circle();
        hinhtron.bk = 4;
        double ChuVi = hinhtron.CV();
        double DienTich = hinhtron.S();
        System.out.printf("Chu vi hinh tron la : %f %n", ChuVi);
        System.out.printf("Dien tich hinh tron la: %f %n", DienTich);

        Car Car1 = new Car();

        System.out.println("\n Bai tap 3:");
        int lanthu1 = Car1.upTo20();
        System.out.printf("Toc do xe trong lan tang thu nhat la : %d km/h %n", lanthu1);
        int lanthu2 = Car1.upTo40();
        System.out.printf("Toc do xe trong lan tang thu hai la : %d km/h %n", lanthu2);
        int lanthu3 = Car1.upTo60();
        System.out.printf("Toc do xe trong lan tang thu ba la : %d hm/h %n ", lanthu3);
        int lanthu4 = Car1.upTo20();
        System.out.printf("Toc do xe trong lan tang thu tu la : %d km/h %n", lanthu4);

        System.out.println("\n Bai tap 4:");
        TimeConservation phut = new TimeConservation();
        int ConvertHourToMin = phut.ConvertHourToMin(2);
        System.out.printf("So phut la: %d", ConvertHourToMin);
        int ConvertDaysToMin = phut.ConvertDaysToMin(3);
        System.out.printf("\nSo phut la: %d ", ConvertDaysToMin);
    }
}
