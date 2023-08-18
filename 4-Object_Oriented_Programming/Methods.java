import java.util.Scanner;
public class Methods {
    static double temp(double tmp){
        return ((tmp-32)*5)/9;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temp in F : ");
        double tmp = scan.nextInt();
        scan.nextLine();
        double ans = temp(tmp);
        System.out.println("Ans in Celsius :"+ans);
        scan.close();
    }
    
}
