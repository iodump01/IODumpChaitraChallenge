/*
Day 30: Implement Binary Search Algorithm 
*/

// Program
import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements (space seperated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be search: ");
        int k = sc.nextInt();

        System.out.println(String.format("The given element is present at %d index.", binarySearch(arr, n, k)));
    }

    public static int binarySearch(int[] arr, int n, int k) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}

/*
 * 
 * Enter the number of elements:
 * 5
 * Enter the elements (space seperated):
 * 23 45 56 68 90
 * Enter the element to be search:
 * 56
 * The given element is present at 2 index.
 * 
 */