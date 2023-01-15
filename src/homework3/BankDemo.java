package homework3;
/*
  снять деньги
        У вас на банковском счету N долларов.
        ВЫ хотите снять все, но банк разрешает снять только сумму,
        которая является делителем текущей суммы на счету и меньше текущей суммы.
        Если вы снимаете максимально возможную сумму каждый день,
        сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
*/
public class BankDemo {
  public static void main(String[] args) {
    Bank bank = new Bank();

    int countTransactionDays;

    boolean isContinue = true;

    while (isContinue){
      bank.setAmountAccount(InputMethods.getUserIntegerPositiveValue("Please, enter Your Amount in Bank (Int): "));

      countTransactionDays = bank.countTransactionDays();
      System.out.printf("Count Days: %d\n-----------------------------------\n", countTransactionDays);

      isContinue = !InputMethods.getBooleanValue(InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
    }
  }
}
