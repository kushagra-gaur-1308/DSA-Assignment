// Problem: Write a java program to delete the element at a given 1-based position pos from an array of n integers. Shift remaining elements to the left.

// Input:
// - First line: integer n
// - Second line: n space-separated integers
// - Third line: integer pos (1-based position to delete)

// Output:
// - Print the updated array with (n-1) elements, space-separated

// Example:
// Input:
// 5
// 10 20 30 40 50
// 2

// Output:
// 10 30 40 50

// Explanation: Delete position 2 (element 20), remaining elements shift left



import java.util.Scanner;
public class Delete {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int pos = s.nextInt();
        for(int i = pos-1;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("Updated array after deletion:");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
