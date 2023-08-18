public class Overloaded_Cons {
    public static void main(String[] args){
        Car car = new Car("Maruti 800" );
        System.out.println(car.name);
        Car car1 = new Car("i10" , "Toyota");
        System.out.println(car1.name);
        System.out.println(car1.company);
    }
}
//basically overloaded constructor have same name but diff parameters
class Car{
    String name ;
    String company ;
    int mile;
    Car(String name , String company , int mile){
        this.name = name;
        this.company = company;
        this.mile = mile;
    }
    Car(String name , String company){
        this.name = name ;
        this.company = company ; 
    }
    Car(String name){
        this.name = name;
    }
}
