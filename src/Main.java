public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 9.99F;

        int millionForOneYear = service.calculate(1000000, 1);
        System.out.println(millionForOneYear);
        //System.out.printf("%.2f", interestRate);

        int millionForTwoYears = service.calculate(1000000, 2);
        System.out.println(millionForTwoYears);
        //System.out.printf("%.2f", interestRate);

        int millionForThreeYears = service.calculate(1000000, 3);
        System.out.println(millionForThreeYears);
       // System.out.printf("%.2f", interestRate);







    }


}

