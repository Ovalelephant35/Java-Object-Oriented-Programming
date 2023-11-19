class Phone{
    String brand;
    static String name;
    int price;
    static{
        name = "SmartPhones";
        System.out.println("Inside Static block");
    }
    Phone(String brand , int price){
        this.brand = brand;
        this.price = price;
        System.out.println("Inside Constructor");
    }
    public static void prints(){
        System.out.println("This is "+name);
    }
    public void show(){
        System.out.println("This is "+brand);
    }
}
public class StaticPrac {
    public static void main(String [] args){
    Phone p1 = new Phone("Apple" ,1500);
    Phone p2 = new Phone("Samsung" , 1700);
    p1.show();
    p2.show();
    Phone.prints();}

}
