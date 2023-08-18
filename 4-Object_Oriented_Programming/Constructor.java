import java.util.Scanner;
public class Constructor {
    public static void main(String[] args){
        System.out.println("Crust : & Sauce : &Toppings : ");
        Scanner scan = new Scanner(System.in);
        String base = scan.nextLine();
        String sauce =scan.nextLine();
        String top =scan.nextLine();
        Pizza pizza = new Pizza(base , sauce , top);
        System.out.println("You have selected the following : "+pizza.base+" ,  "+pizza.sauce+" , "+pizza.top);
        pizza.eat();
        scan.close();
    }
}

class Pizza{
    String base ;
    String sauce;
    String top;
    Pizza(String base , String sauce , String top){
        this.base = base;
        this.sauce = sauce;
        this.top=top;
    }
    void eat(){
        System.out.println("YOu can eat your "+top+" Pizza");
    }
}
