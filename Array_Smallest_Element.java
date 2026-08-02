// Firstly It Sort Array then it find smallest element in Array
import java.util.*;
public class Array_Smallest_Element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total elements=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j,temp;
        System.out.println("Input elements=");
        for(i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        for(i=0 ; i<n-1 ; i++){
            for(j=0 ; j<n-1 ; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array is=");
        for(i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }
        System.out.print("Smallest element is=");
        System.out.print(arr[0]);
    }
}
