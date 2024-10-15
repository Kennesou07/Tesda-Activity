public class AverageOfElementsInArray {
    public static void main(String[] args) {
        byte[] firstSetOfNumbers = {10,15,20,25,30};
        byte[] secondSetOfNumbers = {5,5,5,5,5};
        System.out.println("Test Data 1: Average = " + averageOfElementsInArray(firstSetOfNumbers));
        System.out.println("Test Data 2: Average = " + averageOfElementsInArray(secondSetOfNumbers));
    }
    public static double averageOfElementsInArray(byte[] numbers) {
        double sum = 0;
        for(byte number : numbers){
            sum += number;
        }
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            sum += numbers[i];
//        }
        return sum / numbers.length;
    }
}
