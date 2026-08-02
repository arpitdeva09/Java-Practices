// A number that stays the same when you switch its digits around like( 1221, 12321).
import java.util.*;
public class Palindrome_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number=");
        int n=sc.nextInt();
        int num=n;
        int rem,rev=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(num==rev){
            System.out.println("It is Palindrome Number");
        }
        else{
            System.out.println("It is NOT a Palindrome Number");
        }
    }
}
