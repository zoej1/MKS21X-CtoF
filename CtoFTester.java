/* The function should have celsius and fahrenheit as parameters.
They should be the type double. The function should return a double.*/
public class CtoFTester{
  public static double celsiusToFahrenheit(double celsius) {
    return celsius * (9.0/5.0) + 32.0;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32.0) * (5.0/9.0);
  }

}
