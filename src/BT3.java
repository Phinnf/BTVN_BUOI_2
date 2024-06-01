public class BT3 {
    public static void main(String[] args) {
        Car Car1 = new Car();

        int lanthu1 = Car1.upTo20();
        System.out.printf("Toc do xe trong lan tang thu nhat la : %d km/h %n", lanthu1);
        int lanthu2 = Car1.upTo40();
        System.out.printf("Toc do xe trong lan tang thu hai la : %d km/h %n", lanthu2);
        int lanthu3 = Car1.upTo60();
        System.out.printf("Toc do xe trong lan tang thu ba la : %d hm/h %n ", lanthu3);
        int lanthu4 = Car1.upTo20();
        System.out.printf("Toc do xe trong lan tang thu tu la : %d km/h %n", lanthu4);
    }
}
    
    
