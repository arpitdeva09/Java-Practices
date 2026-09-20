import java.util.*;
public class array_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total Elements="); // Enter total elements that you want in Array
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        System.out.println("Enter Array Elements="); //Type element then press enter so it will count 1 element
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
