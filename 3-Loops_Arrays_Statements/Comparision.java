import java.util.Scanner;
public class Comparision {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers for comparision : ");
        int a = scan.nextInt();
        scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        if(a>b){
            System.out.println(a+ " is greater than "+b);
        }
        else if(a<b){
            System.out.println(b+ " is greater than "+a);
        }
        else if(a==b){
            System.out.println(a+ " is equal to  "+b);
        }
        scan.close();
    }
    
}
