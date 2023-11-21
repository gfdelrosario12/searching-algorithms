public class LinearSearch {
    private int[] dataSet; // Use regular array syntax
    private int numberToBeSearched;

    public LinearSearch(int[] dataSet, int numberToBeSearched) {
        this.dataSet = dataSet;
        this.numberToBeSearched = numberToBeSearched;
    }
        public void searchProcess() {
        boolean isNumberSearched = false;
        int index = 0;
        while(!isNumberSearched) {
            if (numberToBeSearched == this.dataSet[index]) {
                System.out.println("Number to be search found at index:" + index);
                isNumberSearched = true;
            } else {
                System.out.println("Number to be search not equal to number at index: " + index);
                index++;
            }
        }
    }
}
