import java.util.Scanner;

public class swap{

    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        swap(10,20);
    }
}