import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Fahrenheit: ");
        int fahrenheit = sc.nextInt();
        System.out.println(fahrenheitToCelsius(fahrenheit) + " degrees celsius");
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}