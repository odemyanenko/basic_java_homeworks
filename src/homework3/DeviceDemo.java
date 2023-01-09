package homework3;

/* Представим, что у нас есть устройство, в котором две колбы.
   Прибор работает корректно, если температура первой колбы выше 100 градусов,
   а температура второй колбы меньше 100 градусов.

   Вы должны написать метод, который проверяет это устройство.

   Ваша программа должна иметь переменные Temperature1 и Temperature2.
   В результате он выводит сообщение true или false.
*/

public class DeviceDemo {
  public static void main(String[] args) {
    Device device = new Device();

    boolean checkDevice;
    boolean isContinue = true;

    while (isContinue) {
      device.setTemperatureFlaskOne(InputMethods.getUserIntegerValue("Please, enter value (temperature 1 flask): "));
      device.setTemperatureFlaskTwo(InputMethods.getUserIntegerValue("Please, enter value (temperature 2 flask): "));

      checkDevice = device.checkDevice();
      System.out.printf("Can Device work correct? ... : %b\n-----------------------------------\n", checkDevice);

      isContinue = !InputMethods.getBooleanValue(InputMethods.getUserCharValue("Do you want exit (Y-yes, N-no) Y/N: "));
    }
  }
}
