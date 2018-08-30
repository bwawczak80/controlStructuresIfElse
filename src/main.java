import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double temperature;

        System.out.println("Enter a temperature between 92.0 and 104.0");
        Scanner scanner = new Scanner(System.in);
        temperature = scanner.nextDouble();

        double temp = Math.abs(temperature);

        if (temp >= 92.0 && temp < 97.5) {

            System.out.println("Temperature is low.");
        }
        else if (temp >= 97.5 && temp <= 99.5) {
            System.out.println("Temperature is normal.");
        }
        else if (temp > 99.5 && temp <= 104.0)
        {

            System.out.println("Temperature is high.");
        }

        else {
            System.out.println("That is not a valid temperature");
        }

        }



    }

