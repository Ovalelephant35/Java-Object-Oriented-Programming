import java.util.*;
public class RootsofQuad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of constant a, b, c of quadratic equation");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double r1 = (-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        double r2 = (-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("Roots the equation are : "+r1+" "+r2);
        sc.close();
    }
}
