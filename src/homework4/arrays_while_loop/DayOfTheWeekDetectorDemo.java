package homework4.arrays_while_loop;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
  public static void main(String[] args) {
    DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

    int dayNumber = dayOfTheWeekDetector.getDayNumberFromUser();
    String dayOfTheWeek = dayOfTheWeekDetector.findDayOfTheWeek(dayNumber);
    System.out.println(dayOfTheWeek);
  }
}
