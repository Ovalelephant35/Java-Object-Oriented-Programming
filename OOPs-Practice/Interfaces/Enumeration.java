enum Lap{
    Dell(500) , Acer(700) , MSFT(1000) , Apple(8000);//these all are fixed object can be used as shown below
    private int price;
    private Lap(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Enumeration {
    public static void main(String[] args){
        Lap l = Lap.Acer;
        System.out.println(l.getPrice());
        Lap[] ls = Lap.values();
        for(Lap m:ls){
            System.out.println(m + " ; "+m.getPrice());
        }
    }
}
