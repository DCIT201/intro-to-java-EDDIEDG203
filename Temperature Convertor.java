import java.util.Scanner;
public class Main {
    Public static void main(String[] args) {
       //Menu
       Scannerscanner = new Scanner(System.in);
        System.out.println("Temperature Coverter");
        System.out.println("1. Convert celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to celsius");

        //Taking user inputs
        System.out.println(" Enter your choice( 1 or 2): ");
        intchoice = scanner.nextInt();

        //Get temperature inputs
        System.out.println("Enter the temperature: ");
        doubletemperature = scanner.nextDouble();

        //Performing conversions
        if (choice == 1) {
            //Converting from Celsius to Fahrenheit
            doublefahrenheit = (temperature * 9/5) + 32;
            System.out.println(temperature + " celsius is " + fahrenheit + " Fahrenheit");
        }
        else if (choice == 2) {
            // Converting from Fahrenheit to celsius
            doublecelsius = (temperature - 32) * 5/9;
            System.out.println(temperature + " fahrenheit is " + celsius + " Celsius");
        }
        else {
            //invalid
            System.out.println("Invalid choice");
        }
        { scanner.close();
        }
    }
}