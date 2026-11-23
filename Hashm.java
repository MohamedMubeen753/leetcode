import java.util.HashMap;

public class Hashm {
    public static void main(String[] args){
        HashMap <Integer,Integer> ha=new HashMap<>();
        System.out.println( ha.put(20,10));
        System.out.println(ha.put(20,30));
        System.out.println(ha.get(22));
        System.out.println(ha.size());
        System.out.println(ha);

    }
}
