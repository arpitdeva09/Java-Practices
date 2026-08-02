// This Program check only Three-Digit number.
// A number equal to the sum of its own digits each raised to the power of the total number of digits is known as Armstrong Number.
// Like ( 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153).
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your  number=");
        int n=sc.nextInt();
        int original=n;
        int digit,sum=0;
        while(n>0){
            digit=n%10;
            sum+=(digit*digit*digit);
            n/=10;
        }
        if(original==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("NOT a Armstrong Number");
        }
    }
}
