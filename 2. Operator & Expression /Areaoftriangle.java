import java.util.*;
public class Areaoftriangle {
    public static void main(String[] args){
    System.out.println("Which method you want to use : ");
    System.out.println("Press A for Sides method or B for Height and Base method");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char c = s.charAt(0);
    if(c=='A'||c=='a' ){
        System.out.println("Enter 3 sides of trianle");
        double y = sc.nextDouble();
        sc.nextLine();
        double z = sc.nextDouble();
        sc.nextLine();
        double x = sc.nextDouble();
        sc.nextLine();
        double si = (x+y+z)/2;
        double area = Math.sqrt(si*(si-x)*(si-y)*(si-z));
        System.out.println("Area of trianle is :"+area);
    }
    else if(c=='B'|| c=='b'){
        System.out.println("Enter 2 sides of trianle i.e. Perpendicular and base");
        double p = sc.nextDouble();
        sc.nextLine();
        double b = sc.nextDouble();
        sc.nextLine();
        double area = 0.5*p*b;
        System.out.println("Area of trianle is :"+area);
    }
    else{
        System.out.println("Invalid Input");
    }
    sc.close();
    }
}
