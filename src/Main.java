public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = 20;
        int bonus = service.calculate(price);
        System.out.println(miles);
    }
}
