package homework4.arrays_while_loop;

public class DayOfTheWeekDetectorTest {
  public static void main(String[] args) {
    DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();

    test.shouldReturnMonday();
    test.shouldReturnTuesday();
    test.shouldReturnWednesday();
    test.shouldReturnThursday();
    test.shouldReturnFriday();
    test.shouldReturnSaturday();
    test.shouldReturnSunday();
    test.shouldReturnOther();
  }
  public void shouldReturnMonday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(1);
    checkTestResult("Monday".equals(dayOfTheWeek), "Monday");
  }

  private void shouldReturnTuesday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(2);
    checkTestResult("Tuesday".equals(dayOfTheWeek), "Tuesday");
  }

  private void shouldReturnWednesday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(3);
    checkTestResult("Wednesday".equals(dayOfTheWeek), "Wednesday");
  }

  private void shouldReturnThursday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(4);
    checkTestResult("Thursday".equals(dayOfTheWeek), "Thursday");
  }

  private void shouldReturnFriday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(5);
    checkTestResult("Friday".equals(dayOfTheWeek), "Friday");
  }

  private void shouldReturnSaturday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(6);
    checkTestResult("Saturday".equals(dayOfTheWeek), "Saturday");
  }

  private void shouldReturnSunday() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(7);
    checkTestResult("Sunday".equals(dayOfTheWeek), "Sunday");
  }

  private void shouldReturnOther() {
    DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
    String dayOfTheWeek = detector.findDayOfTheWeek(0);
    checkTestResult("Not correct day number".equals(dayOfTheWeek), "Not correct day number");
  }

  private void checkTestResult(boolean condition, String testName) {
    if (condition) {
      System.out.println(testName + " = OK!");
    } else {
      System.out.println(testName + " = FAIL!");
    }
  }

}
