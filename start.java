import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your age here: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter your name darling: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Your age is: "+age);
        sc.close();
    }
}
