abstract class Vehicles {
    public abstract int wheel();
}
//child class bus
class Bus extends Vehicles{
    public int wheel(){
        return 8;
    }
}
//child class auto 
class Auto extends Vehicles{
    public int wheel(){
        return 3;
    }
}
public class Vehicle_Ans{
    public static void main(String[] args){
    Bus b = new Bus();
    System.out.println(b.wheel());
    Auto a = new Auto();    
    System.out.println(a.wheel());
}
}

