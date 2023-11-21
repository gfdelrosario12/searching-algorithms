import java.util.Arrays;

public class BinarySearch {
    private int[] dataSet; // Use regular array syntax
    private int numberToBeSearched;

    public BinarySearch(int[] dataSet, int numberToBeSearched) {
        this.dataSet = dataSet;
        this.numberToBeSearched = numberToBeSearched;
    }

    public void searchProcess() {
        Arrays.sort(this.dataSet);
        int low = 0;
        int high = this.dataSet.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (this.dataSet[mid] == numberToBeSearched) {
                System.out.println("Number found at index: " + (mid - 1));
                return;
            } else if (this.dataSet[mid] > numberToBeSearched) {
                high = mid - 1;
                System.out.println("Number found on the lower half of the data set between the index range: " + low + " - " + (mid));
            } else {
                low = mid + 1;
                System.out.println("Number found on the higher half of the data set between the index range: " + (mid) + " - " + high);
            }
        }
        System.out.println("Number not found in the data set.");
    }
}
