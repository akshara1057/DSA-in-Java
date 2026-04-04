import java.util.*;

public class Binary_Search {
    static int Search(int[] arr, int x, int f, int l) {
        if (f > l) {
            return -1;        }
        int m = f + (l-f) / 2;
        if (x == arr[m]) {
            return m;
        }
        if (x > arr[m]) {
            return Search(arr, x, m + 1, l);
        } else {
            return Search(arr, x, f, m - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int e = sc.nextInt();
        int index = Search(arr, e, 0, n - 1);
        System.out.println(index);
        sc.close();
    }
}