public class CreditPaymentService {

    public double monthlyLoanPayment(double creditAmount, double creditTerm, double loanPercentage) {

        double result;
        double monthlyInterestRate; // ежемесячная процентная ставка (расчитывается loanPercentage(годовая процентная ставка) / 100 / 12)

     /*
       double a;
       double b;
      double c;
     */

        monthlyInterestRate = loanPercentage / 100 / 12 ;

     /*
        a = Math.pow((1 + monthlyInterestRate), creditTerm);
        b = (Math.pow((1 + monthlyInterestRate), creditTerm))-1;   // роспись формулю расчета чтоб не запутаться
        c = a / b;    //  коэффициент аннуитета
     */

        double ratioAnnuity = monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), creditTerm) / ((Math.pow((1 + monthlyInterestRate), creditTerm))-1));

        result = creditAmount * ratioAnnuity;

        return result;
    }
}


/*
p = s *(I+(I/(1+I)^n-1))
 p - ежемесячный платеж
 s - сумма кредита
 I - Ежемесячная процентная ставка (расчитывается F(годовая процентная ставка) / 100 / 12)
 n - срок кредита (указывается количество месяцев)
*/
