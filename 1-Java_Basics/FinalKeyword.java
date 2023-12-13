package Java_Basics;
public class FinalKeyword {
    public static void main(String[] args){
        //This keyword finalizes and locks the variable so that it cannot be changed
        final String name = "Oval";
        //name = "Alpha"; it cannot be assigned as we have used final keyword
        System.out.println(name);
    }
}
