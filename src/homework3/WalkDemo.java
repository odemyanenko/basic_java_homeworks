package homework3;

/*
  First level: - Создайте две переменные isWeekend и isRain.
  Создайте переменную canWalk, значение которой должно быть истинным,
  если это выходной день (isWeekend=true) и не идет дождь (isRain=false)
  */

public class WalkDemo {
  public static void main(String[] args) {
    Walk walk = new Walk();

    boolean canWalk;
    boolean isContinue = true;

    while (isContinue){
      walk.setWeekend(InputMethods.getBooleanValue(InputMethods.getUserCharValue("Please, enter value (is weekend, Y-yes, N-no) Y/N: ")));
      walk.setRain(InputMethods.getBooleanValue(InputMethods.getUserCharValue("Please, enter value (is rain, Y-yes, N-no) Y/N: ")));

      canWalk = walk.isCanWalk();
      System.out.printf("Can I walk? ... : %b\n-----------------------------------\n", canWalk);

      isContinue = !InputMethods.getBooleanValue(InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
    }
  }
}
