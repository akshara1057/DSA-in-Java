import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();
        int revnum=0;
        // int count=0;
        while(x!=0){
            int rem = x%10;
            revnum = revnum*10 + rem;
            x=x/10;
        }
        System.out.println(revnum);
        sc.close();
    }
}
