public class Main {
    public static void main(String[] args) {
        long creditAmount = 1_000_000;
        int creditTerm = 3;
        int monthlyPayment;
        double interestRate = 9.99F;
        long balanceOfDebt = creditAmount;

        double value = (1 + (interestRate / 100 / 12));
        int powValue = creditTerm * 12;

        double result = (Math.pow(value, powValue));

        monthlyPayment = (int) (balanceOfDebt * (((interestRate / 100 / 12) * result) / ((result) - 1)));

        System.out.println(monthlyPayment);
        System.out.printf("%.2f", interestRate);


    }


}

