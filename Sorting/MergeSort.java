package Sorting;

import java.util.Scanner;

public class MergeSort {
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
        
        System.out.println("Sorted Array is: ");
        divide(arr, 0, size-1);
        print(arr);

        sc.close();
    }
    /* This function will start to divide the array recursively, until it breaks it down into the smallest of the units, 
        after which the array is sorted together by putting these partions togther as in the conquring step.
    */
    private static void divide(int[] arr, int startIndex, int endIndex) {
        int mid= startIndex+(endIndex-startIndex)/2;

        if(startIndex>=endIndex){
            return;
        }
        divide(arr, startIndex, mid);
        divide(arr, mid+1, endIndex);

        conquer(arr, startIndex,mid,endIndex);
    }
    /* The function below finally puts back together the divided array
      It does so by also sorting and then placing the elements in their correct order.
     */

    private static void conquer(int[] arr, int startIndex, int mid, int endIndex) {
        int[]mergedArr=new int[endIndex-startIndex+1];
        int idx1=startIndex;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=endIndex){
            if(arr[idx1]<=arr[idx2]){
                mergedArr[x]=arr[idx1];
                x++; idx1++;
            }else{
                mergedArr[x]=arr[idx2];
                x++; idx2++;
            }
        }

        while(idx1<=mid){
            mergedArr[x]=arr[idx1];
                x++; idx1++;
        }
        while(idx2<=endIndex){
            mergedArr[x]=arr[idx2];
                x++; idx2++;
        }

    for(int i=0,j=startIndex; i<mergedArr.length;i++,j++){
        arr[j]=mergedArr[i];
    }
    }
    public static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
