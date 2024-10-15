public class CountOddAndEven {
    public static void main(String[] args) {
        byte[] arrayNumberOne = {1, 2, 3, 4, 5};
        byte[] arrayNumberTwo = {10, 20, 30, 15, 25};
        System.out.println("Test Data 1:");
        countOddEven(arrayNumberOne);
        System.out.println("-----------------");
        System.out.println("Test Data 2:");
        countOddEven(arrayNumberTwo);
    }
    public static void countOddEven(byte[] array){
        byte evenCount = 0;
        byte oddCount = 0;

        for (byte number : array){
            if(number % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    }
}
