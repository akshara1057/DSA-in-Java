import java.util.*;
public class Search_range {
    static int linear(int[] arr,int start,int end,int x){
        for(int i=start;i<=end;i++){
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
        int start = sc.nextInt();
        int end = sc.nextInt();
        int searched = linear(arr,start,end,x);
        if(searched==-1){
            System.out.println("Element not found");
            }
            else{
                System.out.println("Element found at index " + searched);
            }
            sc.close();
    }
}


