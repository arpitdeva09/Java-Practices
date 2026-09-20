import java.util.*;
public class array_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total Elements=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(i=0 ; i<n ; i++){
            sum+=arr[i];
        }
        System.out.println("Sum is="+sum);
    }
}
