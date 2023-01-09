package homework3;
/*
  Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
  Реализует логический метод canBuy,, возвращающий true **
  Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
  Отобразите строку «Я могу купить еду, это ……» и значение.
*/
public class BuyDemo {
  public static void main(String[] args) {
    Buy buy = new Buy();

    boolean canBuy;

    boolean isContinue = true;

    while (isContinue){
      buy.setEdekaOpen(InputMethods.getBooleanValue(InputMethods.getUserCharValue("Please, enter value (is Edeka open?... Y-yes, N-no) Y/N: ")));
      buy.setReweOpen(InputMethods.getBooleanValue(InputMethods.getUserCharValue("Please, enter value (is Rewe open? ... Y-yes, N-no) Y/N: ")));

      canBuy = buy.canBuy();
      System.out.printf("Can I buy food? ... : %b\n-----------------------------------\n", canBuy);

      isContinue = !InputMethods.getBooleanValue(InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
    }
  }
}
