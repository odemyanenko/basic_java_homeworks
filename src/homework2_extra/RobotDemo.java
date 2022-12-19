package homework2_extra;

public class RobotDemo {
  public static void main(String[] args) {
    Robot robotFirst = createRobot("Rider");
    Robot robotSecond = createRobot("john");
    Robot robotThird = createRobot("Peter");
    Robot robotFour = createRobot("Masha");
  }
  public static Robot createRobot(String name)
  {
    Robot robot = new Robot(name);

    robot.sayHello();
    robot.sayYourName();

    return robot;
  }
}
