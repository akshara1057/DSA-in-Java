import java.util.Scanner;
public class fibnocci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(i=2;i<10;i++){
           int temp=a;
            a=b;
            b=temp+b;
            System.out.print(b+" ");
        }
        sc.close();
    }
}
