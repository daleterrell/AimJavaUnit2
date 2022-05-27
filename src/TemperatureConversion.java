
import java.util.Scanner;

public class TemperatureConversion {
   private static double tofahrenheit(double celsius){
   return ( celsius * (9.0/5.0) + 32 );
}


public static void main(String[] args) {

  System.out.println("This program asks you to enter a temperature in Celsius.  It will show you the temperature in Fahrenheit.");  
  double celsius = 0.0;
  double fahrenheit = 0.0;

  Scanner scan = new Scanner(System.in);

  System.out.print("Enter Celsius value: ");
  celsius = scan.nextDouble();

  fahrenheit = tofahrenheit(celsius);

  System.out.println("Fahrenheit value = "
                         +fahrenheit);

  scan.close();
  }
}