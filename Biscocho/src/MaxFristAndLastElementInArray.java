import java.util.Arrays;
import java.util.Scanner;

public class MaxFristAndLastElementInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = scan.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter the element "+( i+1) + ": ");
            array[i] = scan.nextInt();
        }

        int[] arrayOne = {5, 8, 3, 12, 6};
        int[] arrayTwo = {-10, -3, -7, -1};

        System.out.println("---------- Result ------------");
        Elements elementOne = new Elements(arrayOne);
        System.out.println("Data 1: " + Arrays.toString(elementOne.getArray()));
        System.out.println("Test Data 1: Maximum Element = " + elementOne.maxArray +
                ", First Element = " + elementOne.firstArray + ", Last Element = " + elementOne.lastElement);

        System.out.println("---------------------");

        Elements elementTwo = new Elements(arrayTwo);
        System.out.println("Data 2: " + Arrays.toString(elementTwo.getArray()));
        System.out.println("Test Data 2: Maximum Element = " + elementTwo.maxArray +
                ", First Element = " + elementTwo.firstArray + ", Last Element = " + elementTwo.lastElement);

        System.out.println("---------------------");

        Elements inputElement = new Elements(array);
        System.out.println("Data 3: " + Arrays.toString(inputElement.getArray()) + " // using user input ");
        System.out.println("Test Data 2: Maximum Element = " + inputElement.maxArray +
                ", First Element = " + inputElement.firstArray + ", Last Element = " + inputElement.lastElement);
    }
}
