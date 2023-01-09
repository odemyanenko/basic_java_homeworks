package homework3;

/* Представим, что у нас есть устройство, в котором две колбы.
   Прибор работает корректно, если температура первой колбы выше 100 градусов,
   а температура второй колбы меньше 100 градусов.

   Вы должны написать метод, который проверяет это устройство.

   Ваша программа должна иметь переменные Temperature1 и Temperature2.
   В результате он выводит сообщение true или false.
*/

public class Device {
  private int temperatureFlaskOne;
  private int temperatureFlaskTwo;

  public void setTemperatureFlaskOne(int temperatureFlaskOne) {
    this.temperatureFlaskOne = temperatureFlaskOne;
  }

  public void setTemperatureFlaskTwo(int temperatureFlaskTwo) {
    this.temperatureFlaskTwo = temperatureFlaskTwo;
  }

  public boolean checkDevice(){
    return (temperatureFlaskOne > 100 && temperatureFlaskTwo < 100);
  }
}
