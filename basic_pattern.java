import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    int rows, col;
    String exp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows you wish to have: ");
    rows=sc.nextInt();
    System.out.println(("Enter the number of columns you wish to have: "));
    col=sc.nextInt();
    System.out.println("Enter the character you wish to fill the matrix with: ");
    sc.nextLine();
    exp=sc.nextLine();
    for (int i=1;i<=rows;i++){
        for (int j=1;j<=col;j++){
            System.out.print(exp);
        }
        System.out.println(" ");
    }
    sc.close();

    }
}
