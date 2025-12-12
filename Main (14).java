import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int min = scan.nextInt();
        int sec = scan.nextInt();
        System.out.printf("%02d : %02d : %02d" , time,min,sec);
    }
}