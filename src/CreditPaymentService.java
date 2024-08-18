public class CreditPaymentService {
    public int calculate(int creditSum, int creditPeriod_mo) {
        double interestRate_year = 9.99;
        double interestRate_mo = interestRate_year / (100 * 12);
        double monthlyPayment = creditSum * interestRate_mo * Math.pow(1 + interestRate_mo, creditPeriod_mo) / (Math.pow(1 + interestRate_mo, creditPeriod_mo) - 1);
        return (int) monthlyPayment;
    }
}
