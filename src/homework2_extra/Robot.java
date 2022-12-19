package homework2_extra;

public class Robot {

  String name;

  public Robot() {
  }

  public Robot(String name) {
    this.name = name;
  }

  public void sayYourName() {
    System.out.println("My name is " + this.name);
  }

  public void sayHello() {
    System.out.println("Hello!");
  }
}
