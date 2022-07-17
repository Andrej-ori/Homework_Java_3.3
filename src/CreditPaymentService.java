public class CreditPaymentService {

    public double monthlyLoanPayment(double creditAmount, double creditTerm, double loanPercentage) {

        double result;
        double monthlyInterestRate; // ежемесячная процентная ставка (расчитывается loanPercentage(годовая процентная ставка) / 100 / 12)

        monthlyInterestRate = loanPercentage / 100 / 12 ;


        double ratioAnnuity = monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), creditTerm) / ((Math.pow((1 + monthlyInterestRate), creditTerm))-1));

        result = creditAmount * ratioAnnuity;

        return result;
    }
}
