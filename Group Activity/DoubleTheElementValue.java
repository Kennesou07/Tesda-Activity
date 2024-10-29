import java.util.Arrays;
import java.util.Scanner;

public class DoubleTheElementValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scanner.nextInt();
        int[] arrayValues = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter array "+(i+1)+": ");
            arrayValues[i] = scanner.nextInt();
        }
        System.out.println("Original input array: " + Arrays.toString(arrayValues));
        System.out.println("Double of input array: " + Arrays.toString(DoubleElement(arrayValues)));
    }
    private static int[] DoubleElement(int[] value){
        int[] doubleValue = new int[value.length];
        for(int i = 0; i < value.length; i++){
            doubleValue[i] = value[i] * 2;
        }
        return doubleValue;
    }
}