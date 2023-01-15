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

    return result == 0 ? value : result;
  }
  public int countTransactionDays(){
    int result = 0;

    for (int i = amountAccount; i > 0; i -= getMaxDivisor(i)){
      result++;
    }
    return result;
  }
}
