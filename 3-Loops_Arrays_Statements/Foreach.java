import java.util.Scanner;
public class Foreach{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favourite 5 food: ");
        String[] food = new String[5];
        for(int i=0 ;i<5 ;i++){
            food[i] = scan.nextLine();
        }
        for(String j : food) {
            System.out.println(j);
        }
        scan.close();
    }

}