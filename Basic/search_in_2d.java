import java.util.*;
public class search_in_2d {
    static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr = new int[2][2];
        for(int row=0;row<2;row++){
            for(int col=0;col<2;col++){
                arr[row][col]=sc.nextInt();
                }
            }
        int[] ans = search(arr,4);
        System.out.println(Arrays.toString(ans));
        }
    }
