import java.util.Scanner;
public class occurence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = sc.nextInt();
        int count=0;
        while(x!=0){
            int rem = x%10;
            if(rem==7){
                count++;
            }
            x=x/10;
        }
        System.out.println(count);
        sc.close();
    }
}
