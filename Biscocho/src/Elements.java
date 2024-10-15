import java.util.Arrays;

public class Elements {
    int[] array = new int[5];
    int maxArray;
    int firstArray;
    int lastElement;

    public Elements(int[] array) {
        this.array = array;
        this.maxArray = getMaxArray();
        this.firstArray = getFirstElement();
        this.lastElement = getLastElement();

    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        this.maxArray = getMaxArray();
        this.firstArray = getFirstElement();
        this.lastElement = getLastElement();
    }

    private int getMaxArray() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private int getFirstElement() {
        return array[0];
    }

    private int getLastElement() {
        return array[array.length - 1];
    }
}