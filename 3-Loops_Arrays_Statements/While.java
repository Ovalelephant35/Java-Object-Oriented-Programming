import java.util.Scanner;
public class While{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter only positive or 0 to play game : ");
        while(true){
            int t = scan.nextInt();
            scan.nextLine();
            if(t>=0){
                System.out.println("You are still playing the game of postives : ");
            }
            else{
                System.out.println("You have exited by playing negative number : ");
                break;
            }
        }
        scan.close();
    }//there is also do while where the code will at least run once before checking the condition

}