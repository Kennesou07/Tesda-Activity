import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        byte number = sc.nextByte();
        String result = (number < 0) ? "Negative number" : (number > 0) ? "Positive number" : "Neutral number";
        System.out.println(result);
    }
}
