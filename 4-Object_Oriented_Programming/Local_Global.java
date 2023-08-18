import java.util.*;
public class Local_Global {
    public static void main(String[] args){
        //whatever that will be decleared here will be visible to everyone in this class.
        DiceRoller dice = new DiceRoller();
        dice.roll();
    }
}
class DiceRoller{
    Random ran = new Random();
    int num = ran.nextInt(7) ; //this works as it is globally decleared

    // DiceRoller(){
    //     Random ran = new Random();
    //     int num ;
    //     this.num = ran.nextInt(6)+1;
    // } this gives error as the num is called outside of method and thus is local
    void roll(){
        System.out.println("Your randomly Generated number is : "+num );
    }
}
