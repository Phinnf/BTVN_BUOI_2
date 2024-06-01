public class BT2 {
    public static void main(String[] args) throws Exception {
        Circle hinhtron = new Circle();
        hinhtron.bk = 4;
        double ChuVi = hinhtron.CV();
        double DienTich = hinhtron.S();
        System.out.printf("Chu vi hinh tron la : %f %n", ChuVi);
        System.out.printf("Dien tich hinh tron la: %f %n", DienTich);
    }
}