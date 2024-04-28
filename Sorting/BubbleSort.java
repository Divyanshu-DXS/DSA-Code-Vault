package Sorting;
import java.util.Scanner;
// Bubble Sort Logic 
// Time Complexity : O(n^2)

public class BubbleSort {
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
        bubbleSort(arr);
        System.out.println("Sorted Array is: ");
        print(arr);

        sc.close();
    }
    
    /*
    Bubble Sort sorts an array by referencing two adjacent values. Like Arr[0] & Arr[1]..Arr[1] & Arr[2]
    It would then compare and check if the value at the first index Arr[0] is bigger than the value at the second index Arr[1] : 
    If 'True' it would switch values and continue to compare the next value.
    If 'False' it would just continue on to the next value and keep checking. 
    The loop keeps running unless all the bigger values are then pushed to the rightmost end of the array. 
    This sorts the array in ascending order. 
    reverse the logic and the same sorting can be done for desceningd order. 
     */

    public static int[]bubbleSort(int[]arr){
        int size=arr.length;
        int firstIndex;
        int secondIndex;
        int temp;
        for(int i =0; i<size; i++){
            for (int j=0; j<size-i-1;j++){
                firstIndex = arr[j];
                secondIndex = arr[j+1];
                if(firstIndex > secondIndex){
                    temp=firstIndex;
                    arr[j]=secondIndex;
                    arr[j+1]=temp;
                }
            }
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
