package Java_Basics;
import java.util.Scanner;
public class Mathematics {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int abs = Math.abs(a);
        double sqrt = Math.sqrt((double)a);
        System.out.println("Maximum "+max);
        System.out.println("Minimum "+min);
        System.out.println("Absolute "+abs);
        System.out.println("Square root "+sqrt);
        scan.close();
    }
    
}
