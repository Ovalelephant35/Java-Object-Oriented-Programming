import java.util.Scanner;
public class SwitchCal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 2 Numbers : ");
        int a = scan.nextInt();
        scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Operator : +,-,*,/,%");
        String c = scan.nextLine();
        switch(c){
            case "+" : System.out.println(a+b);
            break;
            case "-" : System.out.println(a-b);
            break;
            case "*" : System.out.println(a*b);
            break;
            case "/" : System.out.println(a/b);
            break;
            case "%" : System.out.println(a%b);
            break;
            default : System.out.println("Invalid Input");
        }
        scan.close();
    }
}
