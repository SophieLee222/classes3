public class CreditPaymentService {
    public int calculate(int creditSum, int creditPeriodMo) {
        double interestRateYear = 9.99;
        double interestRateMo = interestRateYear / (100 * 12);
        double monthlyPayment = creditSum * interestRateMo * Math.pow(1 + interestRateMo, creditPeriodMo) / (Math.pow(1 + interestRateMo, creditPeriodMo) - 1);
        return (int) monthlyPayment;
    }
}
