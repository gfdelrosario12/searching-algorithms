import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int[] dataSet = {37, 62, 15, 89, 24, 50, 73, 5, 42, 78};
    public static int numberToBeSearched = 73;


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch(dataSet, numberToBeSearched);
        LinearSearch  linearSearch = new LinearSearch(dataSet, numberToBeSearched);
        Scanner scanner = new Scanner(System.in);
        System.out.print("To simulate binary search, type 'b'. To simulate linear search, type 'l': ");
        String choice = scanner.next();
        if (choice.equals("B") || choice.equals("b")) {
            binarySearch.searchProcess();
        } else if(choice.equals("L") || choice.equals("l")) {
            linearSearch.searchProcess();
        }
    }
}