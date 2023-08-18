import java.util.Scanner;
public class If {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your monthly salary : ");
        int sal = scan.nextInt();
        if(sal<0){
            System.out.println("Invalid Input");
        }
        else if(sal>=0 && sal<=10000){
            System.out.println("Your Salary is less than average");
        }
        else if(sal>10000 && sal<=50000){
            System.out.println("Your Salary is average");
        }
        else if(sal>50000 && sal<=100000){
            System.out.println("Your Salary is more than average");
        }
        else{
            System.out.println("Your are rich");
        }
        scan.close();
    }
    
}
