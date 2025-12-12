import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int maths = scan.nextInt();
       int science = scan.nextInt();
       int social = scan.nextInt();
       int comp = scan.nextInt();
       int eng = scan.nextInt();
       System.out.println("Maths: " + maths);
       System.out.println("Science: " + science);
       System.out.println("Social: " + social);
       System.out.println("Computer: "  + comp);
       System.out.println("English: " + eng);
   }
}