import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String email, username, domain;
        System.out.println("Please enter your email address ");
        email=sc.nextLine();
        if (email.contains("@")){
            username=email.substring(0, email.indexOf('@'));
            domain=email.substring(email.indexOf('@')+1);
            System.out.println("Your username is: "+username);
            System.out.println("The domain of your email address is: "+domain);
        }
        else {
            System.out.println("Sorry, yours does not seem to be a real email address");
        }
        sc.close();
    }
}
