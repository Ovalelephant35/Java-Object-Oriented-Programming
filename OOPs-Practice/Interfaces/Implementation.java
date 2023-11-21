interface allen{
    int yrs = 5;//final and static can be used directly using name of class
    void show();//no need to write abstract they are automatically abs 
    public abstract void give();
}

interface reso{
    int yrs=0;
    void run();
}

class coach implements allen , reso{
    public void show(){
        System.out.println("hi");
    }
    public void give(){

    }
    public void run(){

    }
}
public class Implementation {
    public static void main(String [] args){
    allen A;
    A = new coach();
    A.show();
    }
}
//class-->class extends
//class-->interface implements
//interface-->interfce implemnets