public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        int actual = service.calculate(1000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 10;
        actual = service.calculate(1000, false);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000, false);
        System.out.println("1. " + expected + " == ? == " + actual);
    }
}
