import java.util.*;
public class Menu_Driven_Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("------x------x------");
            System.out.println("Addition=1");
            System.out.println("Substraction=2");
            System.out.println("Multiplication=3");
            System.out.println("Division=4");
            System.out.println("Exit=5");
            System.out.print("Enter your choice=");
            choice=sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.print("Enter A=");
                    int a=sc.nextInt();
                    System.out.print("Enter B=");
                    int b=sc.nextInt();
                    System.out.println("Sum is="+(a+b));
                    break;

                case 2 :
                    System.out.print("Enter A=");
                    int c=sc.nextInt();
                    System.out.print("Enter B=");
                    int d=sc.nextInt();
                    System.out.println("Substraction is="+(c-d));
                    break;

                case 3 :
                    System.out.print("Enter A=");
                    int e=sc.nextInt();
                    System.out.print("Enter B=");
                    int f=sc.nextInt();
                    System.out.println("Multiplication is="+(e*f));
                    break;

                case 4 :
                    System.out.print("Enter A=");
                    int g=sc.nextInt();
                    System.out.print("Enter B=");
                    int h=sc.nextInt();
                    if(h!=0){
                        System.out.println("Division is="+(g/h));
                    }
                    else{
                        System.out.println("Error");
                    }
                    break;

                case 5 :
                    System.out.println("EXIT");
                    break;

                default :
                    System.out.println("Invalid Input Choose Again");
            }
        }
        while(choice!=5);
    }
}
