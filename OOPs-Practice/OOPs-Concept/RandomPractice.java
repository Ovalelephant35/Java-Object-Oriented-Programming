abstract class Uno{
    public void show(){
        System.out.println("Hi");
    }
    public abstract void show1();
}

class numo{
    public void show(){
        System.out.println("Hi");
    }
    static class inner{
        public void show2(){
            System.out.println("in Inner");
        }
    }
}
class dumb{
    public void show(){
        System.out.println("Dumb");
    }
    public void cases(){
        System.out.println("not");
    }
}
public class RandomPractice {
    public static void main(String[] args){
        Uno u = new Uno(){
            public void show1(){
                System.out.println("Bye");
            }
        };
        u.show();

        numo n = new numo();
        numo.inner in = new numo.inner();
        n.show();
        in.show2();
        dumb b = new dumb(){
            public void show(){
                System.out.println("not Dumb");
            }
        };
        b.show();
        b.cases();
    }
}
