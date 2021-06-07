public class BonusMilesService {
    public BonusMilesService() {
    }

    public int calculate(int price) {
        float persent = 20.0F;
        float miles = (float)price / persent;
        System.out.println(miles);
        return 0;
    }
}
