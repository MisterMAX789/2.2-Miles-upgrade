public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

//        int price = 10_000;
//        int miles = service.calculate(price);
//        System.out.println(miles);

        int сostIsCorrect = service.calculate(25000_00);
        System.out.println(сostIsCorrect);

        int сostIsUnder0 = service.calculate(-25000_00);
        System.out.println(сostIsUnder0);

        int сostIsLessThan20 = service.calculate(5_00);
        System.out.println(сostIsLessThan20);

        int сostIs20 = service.calculate(20_00);
        System.out.println(сostIs20);
    }
}
