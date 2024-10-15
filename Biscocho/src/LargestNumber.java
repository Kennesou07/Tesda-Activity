import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        byte firstInput = sc.nextByte();
        System.out.print("Enter 2nd number: ");
        byte secondInput = sc.nextByte();
        System.out.print("Enter 3rd number: ");
        byte thirdInput = sc.nextByte();
        byte largest = firstInput;

        if(secondInput > largest){
            largest = secondInput;
        }
        if(thirdInput > largest){
            largest = thirdInput;
        }
        System.out.println("Largest number: " + largest);
    }
}
