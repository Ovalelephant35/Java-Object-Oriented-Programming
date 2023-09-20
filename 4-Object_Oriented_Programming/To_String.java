public class To_String {
    public static void main(String[] args){
        Carss car = new Carss();
        System.out.println(car);//tostring has been implicitily called 
        System.out.println(car.toString());//tostring has been explicitally called
        //here we can see that tostring job is to create a address of the object and
        //return the given address
    }
}

class Carss{
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+year;
    }
   
}
