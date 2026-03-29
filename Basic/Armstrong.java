import java.util.*;
public class Armstrong{

    static int result(int n){
        int sum=0;
        while(n>0){
            int a = n%10;
            sum = sum + (a*a*a);
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int ans = result(num);
        if(ans == num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}