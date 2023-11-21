@FunctionalInterface//annotation basically help from java itself
interface lamb{
    public int sum(int i, int j );
}

//we will use lambda expression here to implement the function
public class LambdaExp {
    public static void main(String[] args){
        lamb l = (i , j)-> i+j;

        System.out.println(l.sum(4,5));
    }
    
}
//Types of Interfaces --> Normal(More than two methods) , Functional(Only one method) , Marker(empty will be used later not now)