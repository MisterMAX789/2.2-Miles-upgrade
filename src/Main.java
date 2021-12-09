public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

//        int price = 10_000;
//        int miles = service.calculate(price);
//        System.out.println(miles);

        int CostIsCorrect = service.calculate(25000_00);
        System.out.println(CostIsCorrect);

        int CostIsUnder0 = service.calculate(-25000_00);
        System.out.println(CostIsUnder0);

        int CostIsLessThan20 = service.calculate(5_00);
        System.out.println(CostIsLessThan20);

        int CostIs20 = service.calculate(20_00);
        System.out.println(CostIs20);
    }
}