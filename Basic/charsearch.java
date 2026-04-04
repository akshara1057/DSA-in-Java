import java.util.*;
public class charsearch {
    static boolean search(String str , char target){
        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char target = sc.next().charAt(0);
        boolean ans = search(name,target);
        System.out.println(ans);
    }
}
