public class Static_Keyword {
    public static void main(String[] args){
        Friend friend1 = new Friend("Oval");
        String a = friend1.name;
        System.out.println(a);
        System.out.println(Friend.numberoffri);//basically the class owns the member
    }
}
class Friend{
    String name; 
    static int numberoffri;
    Friend(String name){
        this.name = name;
        numberoffri++;
    }
}
