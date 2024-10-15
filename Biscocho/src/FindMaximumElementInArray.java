public class FindMaximumElementInArray {
    public static void main(String[] args) {
        byte[] firstSetOfNumbers = {5,8,3,12,6};
        byte[] secondSetOfNumbers = {-10,-3,-7,-1};
        System.out.println("Test Data 1: Maximum Element = " + findMaximumElementInArray(firstSetOfNumbers));
        System.out.println("Test Data 1: Maximum Element = " + findMaximumElementInArray(secondSetOfNumbers));
    }
    public static byte findMaximumElementInArray(byte[] array) {
        byte biggestElement = array[0];
        for (byte biggest : array){
            if (biggest > biggestElement){
                biggestElement = biggest;
            }
        }
//        for (int i = 0; i <= array.length - 1; i++) {
//            if(array[i] > biggestElement) {
//                biggestElement = array[i];
//            }
//        }
        return biggestElement;
    }
}
