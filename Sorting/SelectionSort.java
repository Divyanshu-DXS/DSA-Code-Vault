package Sorting;
import java.util.Scanner;

// Selection Sort Logic 
// Time Complexity : O(n^2)

public class SelectionSort {
    
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
        selectionSort(arr);
        System.out.println("Sorted Array is: ");
        print(arr);

        sc.close();
    }

    /*
     Selection Sort sorts an array by traversing an array from pointer indexed at 0 and then storing the smallest element in the array. 
     This smallest element is then pushed to the beggining of the array. 
     The array is then traversed again from the next pointer. 
     It keeps on scanning for the smallest element and keeps pushing these values to the beggining of an array, 
     untill the entire array is sorted. 
     */

    private static int[] selectionSort(int[] arr) {

        int temp=0;
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
           temp=arr[i];
           arr[i]=arr[smallest];
           arr[smallest]=temp;
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
