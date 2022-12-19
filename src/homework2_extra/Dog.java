package homework2_extra;

public class Dog {
  String name;
  int age;
  String color;

  public Dog(String name) {
    this.name = name;
  }

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public void voice1(){
    System.out.printf("%s %s %s\n", this.name, this.name, this.name);
  }
  public void voice2(){
    System.out.printf("name: %s, age: %d\n", this.name, this.age);
  }

  public void voice3(){
    System.out.printf("name: %s, age: %d, color: %s\n", this.name, this.age, this.color);
  }
  public void happyBirthday() {
    this.age++;
  }

  void changeColor(String newColor) {
    this.color = newColor;
  }
}
