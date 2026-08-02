//Count positive, negative, and zero values.
import java.util.*;
public class Check_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total elements=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Input elements=");
        int i,j,temp;
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
        System.out.println("Sorted array=");
        for(i=0 ; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
        int count_pos=0,count_neg=0, count_z=0;
        for(i=0 ; i<arr.length ; i++){
            if(arr[i]>0){
                count_pos++;
            }
        }
        System.out.println("Number of Positive elements is="+count_pos);
        for(i=0 ; i<arr.length ; i++){
            if(arr[i]<0){
                count_neg++;
            }
        }
        System.out.println("Number of Negative elements is="+count_neg);
        for(i=0 ; i<arr.length ; i++){
            if(arr[i]==0){
                count_z++;
            }
        }
        System.out.println("Number of Zeros elements is="+count_z);
    }
}
