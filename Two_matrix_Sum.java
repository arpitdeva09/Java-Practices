import java.util.*;
public class Two_matrix_Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row=");
        int r=sc.nextInt();
        System.out.print("Enter column=");
        int c=sc.nextInt();
        int i,j;
        int a[][]=new int[r][c];
        int sum[][]=new int[r][c];
        System.out.println("Enter Matrix A elements=");
        for(i=0 ; i<r ; i++){
            for(j=0 ; j<c ; j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]=new int[r][c];
        System.out.println("Enter matrix B elements=");
        for(i=0 ; i<r ; i++){
            for(j=0 ; j<c ; j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A=");
        for(i=0 ; i<r ; i++){
            for(j=0 ; j<c ; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B=");
        for(i=0 ; i<r ; i++){
            for(j=0 ; j<c ; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0 ; i<r ; i++){
            for(j=0 ; j<c ; j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of 2 matrix is=");
        for(i=0 ; i<r ; i++){
            for(j=0 ; j<c ; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
