public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        
        System.out.println("1.000.000 руб на 12 месяцев");
        System.out.println(service.calculate(1_000_000, 12));

        System.out.println();
        System.out.println("1.000.000 руб на 24 месяца");
        System.out.println(service.calculate(1_000_000, 24));

        System.out.println();
        System.out.println("1.000.000 руб на 36 месяцев");
        System.out.println(service.calculate(1_000_000, 36));
    }
}