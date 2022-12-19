package homework2;

public class Task3_Calories {
  public static void main(String[] args) {
//    Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите
//    пиццу диаметром 28 см. Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

    int caloriesOneСentimeter = 40;

    double calories24 = getSquarePizza(24);
    double calories40 = getSquarePizza(40);

    System.out.printf("More calories in pizza 40cm then 24cm: %.2f calories", calories40 - calories24);
  }

  public static double getSquarePizza(double diameter) {
    return diameter * diameter / 4 * Math.PI;
  }
}
