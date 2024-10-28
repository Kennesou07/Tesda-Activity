import java.util.Arrays;
import java.util.Scanner;

public class DoubleTheElementValue {
    public static void main(String[] args) {
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