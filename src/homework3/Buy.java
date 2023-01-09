package homework3;

/*
  Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
  Реализует логический метод canBuy,, возвращающий true **
  Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
  Отобразите строку «Я могу купить еду, это ……» и значение.
*/

public class Buy {
  private boolean isEdekaOpen;
  private boolean isReweOpen;

  public void setEdekaOpen(boolean edekaOpen) {
    isEdekaOpen = edekaOpen;
  }

  public void setReweOpen(boolean reweOpen) {
    isReweOpen = reweOpen;
  }

  public boolean canBuy(){
    return (isEdekaOpen || isReweOpen);
  }
}
