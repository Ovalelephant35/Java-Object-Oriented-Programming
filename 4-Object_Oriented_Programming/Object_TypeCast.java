class base1{}
class base2{}
class der1 extends base1{}
class der2 extends base1{}
class der3 extends base2{}
class der4 extends base2{}
public class Object_TypeCast {
    public static void main(String[] args){
        base2 b = new der4();
        der4 d = (der4)b;//correct satisfies all 3 points
        //base1 a = (base1)b;incorrect as base and b does not hold any relation
        base2 a = (base2)b;
        //Object o = (der3)b;//incorrect as rule number of runtime is not satisfied
        d.equals(a);
    }
}
