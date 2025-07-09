import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        greet("Neha");
        greet("Neha", "Makru");
    }
    static void greet(String first, String last){
        System.out.println("Hello "+first+" "+last);
    }
    static void greet(String first){
        System.out.println("Hello "+first);
    }
}
