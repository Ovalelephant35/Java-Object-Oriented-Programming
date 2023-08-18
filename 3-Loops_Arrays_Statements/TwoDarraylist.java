import java.util.ArrayList;
public class TwoDarraylist {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> Vehicles = new ArrayList<>();
        ArrayList<String> Cars = new ArrayList<>();
        ArrayList<String> Bikes = new ArrayList<>();
        ArrayList<String> Planes = new ArrayList<>();
        Cars.add("Maruti");
        Cars.add("Toyota");
        Cars.add("BMW");
        Bikes.add("Honda");
        Bikes.add("Pulsar");
        Bikes.add("Royal");
        Planes.add("Boeing");
        Planes.add("Airbus");
        Planes.add("747");
        Vehicles.add(Cars);
        Vehicles.add(Bikes);
        Vehicles.add(Planes);
        for(int i=0 ; i<3 ;i++){
            for(int j=0 ; j<3 ; j++){
                System.out.println(Vehicles.get(i).get(j));
            }
        }
    }
}
