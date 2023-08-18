import java.util.Random;
public class Randoms {
    public static void main(String[] args){
        Random name = new Random();
        int num = name.nextInt(6)+1;
        System.out.print("Your random number is : "+num+" " );
    }
}
