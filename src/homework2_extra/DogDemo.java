package homework2_extra;

public class DogDemo {
  public static void main(String[] args) {
    String line = "----------------------------------------";

    System.out.println(line);
    Dog dog = new Dog("Tuzik");
    dog.voice1();

    System.out.println(line);
    Dog dog2 = new Dog("Bobik", 2);
    dog2.voice2();

    System.out.println(line);
    Dog dog3 = new Dog("Reks", 4);
    dog3.voice2();
    dog3.happyBirthday();
    dog3.voice2();

    System.out.println(line);
    Dog dog4 = new Dog("Reks", 4, "black");
    dog4.voice3();

    System.out.println(line);
    Dog dog5 = new Dog("Reks", 4, "white");
    dog5.voice3();
    dog5.changeColor("red");
    dog5.voice3();
  }
}
