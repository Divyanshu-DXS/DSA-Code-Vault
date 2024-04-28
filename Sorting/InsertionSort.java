package Sorting;
import java.util.Scanner;

// Insertion Sort
// Time Complexity : O(n^2)

public class InsertionSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        System.out.println("size of the array is : " + size);
        System.out.println(" Enter the elements of the array : ");
        int []arr=new int[size];
        int j=0;
        for (int i : arr) {
            System.out.print("Element at index: "+j+" is :- ");
            i=sc.nextInt();
            arr[j]=i;
            j++;           
        }
        System.out.println("Original Array is : ");
        print(arr);
        insertionSort(arr);
        System.out.println("Sorted Array is: ");
        print(arr);

        sc.close();
    }

    /*
     Insetion Sort sorts an array by dividing it into 2 parts. A sorted part, and an unsorted part. 
    to Traverse these 2 arrays we use 2 different loops, one that moves forward towards last index, 
    and anotehr loop that teaverses backwards to index 0 withing sorted part.
    We store the value of first element of unsorted array in a variable (currElement)
    We scan the sorted part until the currElement is > array element at that index being scanned. 
    And running this nested loop keeps sorting the arrays on the go. 
     */

    private static int[] insertionSort(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int index=i-1;
            int currElement = arr[i];
            while(index>=0 && currElement<arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=currElement;
        }
        return arr;
    }

    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    
}
