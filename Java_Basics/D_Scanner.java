import java.util.Scanner;
public class D_Scanner{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tt = scan.nextInt();
        System.out.println("Your input is "+ tt);
        scan.close();
    }
}