import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number you wish to print the table of: ");
        num=sc.nextInt();
        for (int i=1;i<11;i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        sc.close();
    }
}
