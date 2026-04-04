import java.util.Scanner;
class largest_element{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int a,b,c;
            a=sc.nextInt();            
            b=sc.nextInt();            
            c=sc.nextInt();            
            // int max=a;
            // if(a>b && a>c){
            //     max=a;
            // }
            // else if(b>a && b>c){
            //     max=b;
            // }
            // else
            //     max=c;

            int max=Math.max(c,Math.max(a,b));
        System.out.println("Maximum number is "+ max);
        sc.close();
        }
    }