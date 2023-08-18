import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        String [][] cars = new String[2][2];
            for(int j=0 ; j<2 ; j++){
                System.out.println("Enter the name of the car :"+(j+1));
                cars[0][j] = scan.nextLine();
            }
            for(int j=0 ; j<2 ; j++){
                System.out.println("Enter the Milage  of the car : "+cars[0][j]);
                cars[1][j] = scan.nextLine();
            }
            for(int j=0 ; j<2 ; j++){
                System.out.println("Name of the car and milage of cars are respectively: "+cars[0][j]+ " " +cars[1][j]);
            }
            scan.close();

    }
}
