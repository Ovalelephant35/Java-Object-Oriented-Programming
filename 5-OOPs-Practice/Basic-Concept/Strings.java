public class Strings {
    public static void main(String[] args){
        String name = new String("Anurag");//though there is no need to create new object and it can be used directly
        System.out.println("Hello "+name);
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Singh"));//string are immutable that is they cannot be changed for mutable use string buffer
        //string buffer is thread safe and string builder is not thread safe and rest both of them almost same
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.capacity());
    }
}
