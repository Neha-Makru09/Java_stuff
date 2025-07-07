import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int choice;
        float kg, pound;
        System.out.println("1.Convert kg to pounds\n2.Convert pounds to kg\nChoose your option");
        choice=sc.nextInt();
        if (choice==1) {
            System.out.print("Enter the size in kg please: ");
            kg=sc.nextFloat();
            System.out.println("The measure in pounds is: "+(kg*2.2046));
        }
        else {
            System.out.print("Enter the weight in pounds please: ");
            pound=sc.nextFloat();
            System.out.println("The measure in kg is "+(pound/2.2046));
        }
        sc.close();
    }
}
