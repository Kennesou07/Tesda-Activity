import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int firstInput = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int secondInput = sc.nextInt();
        int minimumNumber = 0;

        if (firstInput == secondInput) {
            System.out.println("Input are equal.");
        }else{
            minimumNumber = firstInput < secondInput ? firstInput : secondInput;
            System.out.println("Minimum number is " + minimumNumber);
        }
    }
}
