import java.util.*;
public class minmax {
    static int min(int[] arr,int n){
        int minnum = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<minnum){
                minnum=arr[i];
            }
        }
        return minnum;
    }
    static int max(int[] arr,int n){
        int maxnum=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>maxnum){
                maxnum=arr[i];
            }
        }
        return maxnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int minimum=min(arr,n);
        int maximum = max(arr,n);
        System.out.println(minimum);
        System.out.println(maximum);
        sc.close();
    }
}
