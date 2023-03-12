package homework1_1;

public class Main {
  public static void main(String[] args) {
    String nameByte = "byte";
    String nameShort = "short";
    String nameInt = "int";
    String nameLong = "long";
    String nameFloat = "float";
    String nameDouble = "double";
    String nameChar = "char";
    String nameBoolean = "boolean";

    byte valueByte = 1;
    short valueShort = 2000;
    int valueInt = 1000000000;
    long valueLong = 123000000000L;
    float valueFloat = 12.345f;
    double valueDouble = 12.3434;
    char valueChar = 'q';
    boolean valueBoolean = true;

    String line = "----------------------------------------------------------------------------------------------------" +
            "--------------------\n";

    System.out.printf(line);
    System.out.printf("|%12s | %12s | %12s | %12s | %12s | %12s | %12s | %12s |\n",
            nameByte, nameShort, nameInt, nameLong, nameFloat, nameDouble, nameChar, nameBoolean);
    System.out.printf(line);
    System.out.printf("|%12d | %12d | %12d | %12d | %12.4f | %12.4f | %12c | %12b |\n",
            valueByte, valueShort, valueInt, valueLong, valueFloat, valueDouble, valueChar, valueBoolean);
    System.out.printf(line);
  }
}