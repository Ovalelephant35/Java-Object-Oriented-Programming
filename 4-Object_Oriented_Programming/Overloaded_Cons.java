public class Overloaded_Cons {
    public static void main(String[] args){
        Cars car = new Cars("Maruti 800" );
        System.out.println(car.name);
        Cars car1 = new Cars("i10" , "Toyota");
        System.out.println(car1.name);
        System.out.println(car1.company);
    }
}
//basically overloaded constructor have same name but diff parameters
class Cars{
    String name ;
    String company ;
    int mile;
    Cars(String name , String company , int mile){
        this.name = name;
        this.company = company;
        this.mile = mile;
    }
    Cars(String name , String company){
        this.name = name ;
        this.company = company ; 
    }
    Cars(String name){
        this.name = name;
    }
}
