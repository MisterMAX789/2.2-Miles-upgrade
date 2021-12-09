public class BonusMilesService {
    public int calculate(int cost) {
        if(cost < 0) {
            cost = 0;
        }
        return cost / 20 / 100;
    }
}
