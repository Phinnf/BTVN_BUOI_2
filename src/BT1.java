public class BT1 {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.born = 2004;
        int tuoi = person.age();
        System.out.printf("So tuoi la %d", tuoi);
    }
}
