import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String hexa = scan.nextLine();
        int integer = Integer.parseInt(hexa,16);
        String oct = scan.nextLine();
        int octal = Integer.parseInt(oct,8);
        System.out.println("Hexadecimal to Integer: " + integer);
        System.out.println("Octal to Integer: " + octal);
    }
}