public class CreditPaymentService {
    public int calculate(long creditAmount, int creditTerm) {

        double interestRate = 9.99F;
        long balanceOfDebt = creditAmount;

        int monthlyPayment;
        double value = (1 + (interestRate / 100 / 12));
        int powValue = creditTerm * 12;

        double result = (Math.pow(value, powValue));

        monthlyPayment = (int) (balanceOfDebt * (((interestRate / 100 / 12) * result) / ((result) - 1)));


        return monthlyPayment;
    }


}
