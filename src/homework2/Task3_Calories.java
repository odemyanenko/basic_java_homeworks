package homework2;

public class Task3_Calories {
  public static void main(String[] args) {
//    Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите
//    пиццу диаметром 28 см. Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.

    int caloriesOneСentimeter = 40;

    double calories24 = getSquarePizza(24);
    double calories28 = getSquarePizza(28);

    System.out.println(calories24);
    System.out.println(calories28);
    System.out.printf("More calories in pizza 28cm then 24cm: %.2f calories", (calories28 - calories24)*caloriesOneСentimeter);
  }

  public static double getSquarePizza(double diameter) {
    return diameter * diameter / 4 * Math.PI;
  }
}
