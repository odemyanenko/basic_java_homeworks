package homework3;

public class Bank {
  private int amountAccount;

  public void setAmountAccount(int amountAccount) {
    this.amountAccount = amountAccount;
  }

  private static int getMaxDivisor(int value){
    int result = 0;

    for (int i = value - 1; i >= 1; i--){
      if (value % i == 0) {
        result = i;
        break;
      }
    }
    result = result == 0 ? value : result;

    return result;
  }
  public int countTransactionDays(){
    int result = 0;

    for (int i = amountAccount; i > 0; i -= getMaxDivisor(i)){
      result++;
    }
    return result;
  }
}
