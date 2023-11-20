import java.util.Arrays;

public class BinarySearch {
    private int[] dataSet; // Use regular array syntax
    private int numberToBeSearched;

    public BinarySearch(int[] dataSet, int numberToBeSearched) {
        this.dataSet = dataSet;
        this.numberToBeSearched = numberToBeSearched;
    }

    private boolean search() {
        Arrays.sort(this.dataSet);
        int firstDivide = numberToBeSearched / this.dataSet[-1];
        return false;
    }
}
