package homework4.arrays_for_loop;

/*
Найдите ошибку в программе и исправить её:
class ArrayLength1 {
  public static void main(String[] args) {
    int numbers = new int[2];
    System.out.println(numbers[-1]);
  }
}
*/
public class ArrayLength1 {
  public static void main(String[] args) {
    int[] numbers = new int[2];
    System.out.println(numbers.length);
  }
}
