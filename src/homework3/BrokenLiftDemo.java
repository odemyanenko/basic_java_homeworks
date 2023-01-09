package homework3;
/*
        сломанный лифт
        лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
        Лифт сломан.
        Каждый раз он поднимается на N этажей и спускается на M этажей.
        Если на последнем подьеме лифт превысил колличество этажей,
        то считается что лифт поднялся на самый верх.

        Найдите количество подьемов, которые понадобятся лифту.
        реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
*/
public class BrokenLiftDemo {
  public static void main(String[] args) {
    BrokenLift brokenLift = new BrokenLift();

    int numberOfLifts;

    boolean isContinue = true;

    while (isContinue){

      brokenLift.setFloors(InputMethods.getUserIntegerPositiveValue("Please, enter floor value: "));
      brokenLift.setStepUp(InputMethods.getUserIntegerPositiveValue("Please, enter stepUp value: ", brokenLift.getFloors()));
      brokenLift.setStepDown(InputMethods.getUserIntegerPositiveValue("Please, enter stepDown value: ", brokenLift.getStepUp()));

      System.out.println("1 variant method...");
      numberOfLifts = brokenLift.numberOfLifts(brokenLift.getFloors(), brokenLift.getStepUp(), brokenLift.getStepDown());
      System.out.printf("1v. Count lifts: %d\n-----------------------------------\n", numberOfLifts);

      System.out.println("2 variant method...");
      numberOfLifts = brokenLift.numberOfLifts();
      System.out.printf("2v. Count lifts: %d\n-----------------------------------\n", numberOfLifts);

      isContinue = !InputMethods.getBooleanValue(InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
    }
  }
}
