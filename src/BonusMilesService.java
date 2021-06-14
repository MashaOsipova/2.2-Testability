public class BonusMilesService {
    public BonusMilesService() {
    }

    public int calculate(int price) {
        int miles = 20;
        int bonus;
        bonus = price / miles;
        return bonus;
    }
}
