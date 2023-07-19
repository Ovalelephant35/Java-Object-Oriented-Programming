import java.util.Scanner;
public class Arithematic_operators{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    scan.nextLine();
    int b = scan.nextInt();
    scan.nextLine();
    int add = a+b;
    int sub = a-b;
    int mul = a*b;
    int mod = a%b;
    int div = a/b;
    System.out.println("Addition : "+add);
    System.out.println("Subsraction : "+sub);
    System.out.println("Multiplication : "+mul);
    System.out.println("DIvision : "+mod);
    System.out.println("Modulus : "+div);
    scan.close();
    }
}