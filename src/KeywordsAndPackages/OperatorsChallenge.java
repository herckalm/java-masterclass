package KeywordsAndPackages;

public class OperatorsChallenge {
    public static void main(String[] args) {
        double firstDouble = 20.00;
        double secondDouble = 80.00;

        double result = (firstDouble + secondDouble) * 101.00;
        double remainder = result % 40.00;

        boolean rem = remainder == 0.00;
        System.out.println(rem);

        if (remainder != 0) {
            System.out.println("got some remainder");
        }
    }
}
