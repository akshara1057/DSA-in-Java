/*
Problem Statement:
------------------
You are given a sorted array which can be either in ascending or descending order.
Write a program to find the index of a target element in the array using binary search.
If the element is not present, return -1.

Example 1:
Input: arr = [1, 3, 5, 7, 9], target = 7
Output: 3

Example 2:
Input: arr = [9, 7, 5, 3, 1], target = 7
Output: 1


Solution : Check and Compare the first and the last Index
*/
import java.util.*;
public class BinarySearch_Agnostic {
    static int OrderAgnosticBS(int[] arr,int target){
        int f=0;
        int l = arr.length-1;
        // if(arr[f]<arr[l]){
        //     isAc = true;
        // }
        // else{
        //     isAc=false;
        // }
        // you can write this also
        boolean isAc = arr[f]<arr[l];
        while(f<=l){
            int m = f + (l-f)/2;
            if(target == arr[m]){
                return m;
            }
            if(isAc){
                if(target>arr[m]){
                f = m+1;
            }
            else{
                l = m-1;
            }
            }
            else{
                if(target>arr[m]){
                l=m-1;
            }
            else{
                f = m+1;
            }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to be searched");
        int e = sc.nextInt();
        int index;
            index = OrderAgnosticBS(arr, e);
        System.out.println("index is "+ index);
        sc.close();
    }
}
