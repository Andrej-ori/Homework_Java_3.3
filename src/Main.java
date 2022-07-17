public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculete = new CreditPaymentService();

        double creditAmount = 1_000_000; // сумма кредита
        double creditTerm = 12; // срок кредита в месяцах
        double loanPercentage = 9.99; // процент кредита
        double monthlyLoanPayment; // ежемесячный платёж по кредиту

        System.out.println("\nПриложение для расчета ежемесячного платежа по кредиту");

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита : 12 месяцев(а)");
        System.out.println("Годовая процентная ставка : 9,99 %");

        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage); // обращение к оператору calculete в методе monthlyLoanPayment (находится в CreditPaymentService.java)

        long a = (long) monthlyLoanPayment; // округление результата (объявление переменой "a" тип long (т.к. у переменной monthlyLoanPayment тип double) для "отсечения" цифр после запятой
        System.out.println("Ежемесячный платёж по кредиту составляет : " + a);

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита : 24 месяцев(а)");
        System.out.println("Годовая процентная ставка : 9,99 %");

        creditTerm = 24; // изменение срока кредита с 12 на 24

        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);   // обращение к оператору calculete в методе monthlyLoanPayment (находится в CreditPaymentService.java)

        a = (long) monthlyLoanPayment;  // переменная "a" уже была объявлена поэтому сейчас её только изменяем присвоив новое значение monthlyLoanPayment полученое выше
        System.out.println("Ежемесячный платёж по кредиту составляет : " + a);

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита : 36 месяцев(а)");
        System.out.println("Годовая процентная ставка : 9,99 %");

        creditTerm = 36;   // изменение срока кредита с 24 на 36

        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);   // обращение к оператору calculete в методе monthlyLoanPayment (находится в CreditPaymentService.java)

        a = (long) monthlyLoanPayment;
        System.out.println("Ежемесячный платёж по кредиту составляет : " + a);
    }
}
