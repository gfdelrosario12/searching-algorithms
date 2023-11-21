import java.util.Arrays;

public class BinarySearch {
    private int[] dataSet; // Use regular array syntax
    private int numberToBeSearched;

    public BinarySearch(int[] dataSet, int numberToBeSearched) {
        this.dataSet = dataSet;
        this.numberToBeSearched = numberToBeSearched;
    }

    private boolean searchProcess() {
        Arrays.sort(this.dataSet);
        int low = 0;
        int high = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (this.dataSet[mid] == numberToBeSearched) {
                return true; // Target found, return the index
            } else if (this.dataSet[mid] > numberToBeSearched) {
                high = mid - 1; // Update the high index
            } else {
                low = mid + 1; // Update the low index
            }
        }
        return false;
    }
}
