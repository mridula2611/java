import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int date = scan.nextInt();
    int month = scan.nextInt();
    int year = scan.nextInt();
   	System.out.printf("%02d / %0op2d / %4d" , date,month,year);
    }
}