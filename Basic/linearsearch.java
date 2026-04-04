import java.util.*;
public class linearsearch {
    static int linear(int[] arr,int n,int x){
        // for(int e : arr){
        //     if(e==x){
        //         return e;
        //     }
        // }
        // ismei hamara 'e' array ke elemnts rkhta h , we dont need index here so return e return the element not index
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int searched = linear(arr,n,x);
        if(searched==-1){
            System.out.println("Element not found");
            }
            else{
                System.out.println("Element found at index " + searched);
            }
            sc.close();
    }
}

