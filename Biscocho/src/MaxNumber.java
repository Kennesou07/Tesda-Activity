import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        byte firstInput = scan.nextByte();
        System.out.print("Enter the second number: ");
        byte secondInput = scan.nextByte();

        boolean isEqual = firstInput == secondInput;

        if(isEqual){
            System.out.println("The input numbers are equal");
        }else{
            byte maxNum = max(firstInput,secondInput);
            System.out.println("The max number is " + maxNum);
        }
    }

    private static byte max(byte num1, byte num2) {
        return num1 > num2 ? num1 : num2;
    }

}
