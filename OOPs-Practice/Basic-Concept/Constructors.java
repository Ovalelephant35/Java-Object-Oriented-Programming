class Alp{
    Alp(){
        System.out.println("In Alp OG");
    }
    Alp(int n){
        System.out.println("In Alp int");
    }
}

class Blp extends Alp{
    Blp(int n){

    }
    Blp(){
        // this();
        super(5);//it is always called regardless of whether you mention it or not it is the first to be called and also keep in mind that you have to define it explicitly if in super class there is no OG constructor
        System.out.println("In Blp OG");
    }
}




public class Constructors {
    
}
