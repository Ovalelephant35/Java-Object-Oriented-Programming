import java.util.Scanner;
public class Logical {
    public static void main(String[] args){
        // there are 3 logical operators mainly or and and not specficially for there purposes
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        scan.nextLine();
        if(age>0 && age<18){
            System.out.println("You are underage");
        }
        else if(age>=18 && age<=60){
            System.out.println("You are middleage");
        }
        else if(age>60){
            System.out.println("You are Oldage");
        }
        scan.close();
    }
    
}
