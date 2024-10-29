import java.util.Scanner;

public class ReturnNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.print("Negative number: " + returnNegative(number));
    }
    public static int returnNegative(int number) {
        return number < 0 ? number : number * -1;
    }
}
