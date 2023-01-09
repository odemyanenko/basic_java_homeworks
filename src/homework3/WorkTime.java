package homework3;

import java.util.Random;

/*
    Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.

    Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
    когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
    а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).

    Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.

    Итак: требуется написать программу,
    которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
    сколько полных часов осталось до конца рабочего дня.

    Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    Обьяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800,
      далее оно должно выводиться на экран (для тех, кто понимает в секундах) и
      на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.
    */
public class WorkTime {
  static Random random = new Random();
  private int timeInSeconds;

  public void setTimeInSeconds(){
    timeInSeconds = random.nextInt(28800 + 1);
  }

  private static int getWhole(int number, int div){
    return number / div;
  }

  private static int getRemains(int number, int div){
    return number % div;
  }

  public void displayTime(){
    int remainder = 0;
    String line = "------------------------------------------------";

    int hours = getWhole(timeInSeconds, 3600);
    remainder = getRemains(timeInSeconds,3600);

    int minutes = getWhole(remainder,60);
    remainder = getRemains(remainder,60);

    int seconds = remainder;

    System.out.println(line);
    System.out.println("Information about the remaining working time:");
    System.out.println(line);
    System.out.printf("-Remain (seconds) = %,d\n", timeInSeconds);
    System.out.println(line);
    System.out.printf("-Remain (hours, minutes, seconds) = %02d:%02d:%02d\n", hours, minutes, seconds);
    System.out.println(line);
  }

}
