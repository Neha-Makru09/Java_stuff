import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the width here: ");
        double width=sc.nextDouble();
        System.out.println("Please enter the height here: ");
        double height= sc.nextDouble();
        double area= height* width;
        System.out.println("The area is: "+area+" cm²");
        sc.close();
    }
