package homework3;

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
