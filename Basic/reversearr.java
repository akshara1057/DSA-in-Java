import java.util.*;

public class reversearr {

    static void reversearr(int[] arr){
        int i, j;
        i = 0;
        j = arr.length - 1;

        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }

        for(i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];   // array size

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        reversearr(arr);
    }
}