//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculete = new CreditPaymentService();
        //Scanner num = new Scanner(System.in);

        double creditAmount = 1_000_000; // сумма кредита
        double creditTerm = 12; // срок кредита в месяцах
        double loanPercentage = 9.99; // процент кредита
        double monthlyLoanPayment; // ежемесячный платёж по кредиту

        System.out.println("\nПриложение для расчета ежемесячного платежа по кредиту");
        /*
        System.out.print("\nВведите Сумму кредита: "); // возможность ввода данных вручную с клавиатуры
        creditAmount = num.nextDouble();

        System.out.print("\nВведите Срок кредита (в месяцах): ");
        creditTerm = num.nextDouble();

        System.out.print("\nВведите Процент по кредиту: (в процентах)");
        loanPercentage = num.nextDouble();
        */
        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита : 12 месяцев(а)");
        System.out.println("Годовая процентная ставка : 9,99 %");

        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);

         long a = (long) monthlyLoanPayment; // округление результата
        System.out.println("Ежемесячный платёж по кредиту составляет : " + a);

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита : 24 месяцев(а)");
        System.out.println("Годовая процентная ставка : 9,99 %");

        creditTerm = 24;

        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);

        a = (long) monthlyLoanPayment;
        System.out.println("Ежемесячный платёж по кредиту составляет : " + a);

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита : 36 месяцев(а)");
        System.out.println("Годовая процентная ставка : 9,99 %");

        creditTerm = 36;

        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);

        a = (long) monthlyLoanPayment;
        System.out.println("Ежемесячный платёж по кредиту составляет : " + a);
    }
}
