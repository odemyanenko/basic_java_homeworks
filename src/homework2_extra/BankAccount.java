package homework2_extra;

public class BankAccount {
  String ownerFirstName;
  String ownerLastName;
  int moneyAmount;

  BankAccount(String ownerFirstName,
              String ownerLastName,
              int moneyAmount) {
    this.ownerFirstName = ownerFirstName;
    this.ownerLastName = ownerLastName;
    this.moneyAmount = moneyAmount;
  }

  String getOwnerFirstName() {
    return this.ownerFirstName;
  }

  String getOwnerLastName() {
    return this.ownerFirstName;
  }

  public int getMoneyAmount() {
    return this.moneyAmount;
  }
}
