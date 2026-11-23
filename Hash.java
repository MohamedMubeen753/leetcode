import java.util.HashSet;

public class Hash {
    public static void main(String[] args){
        HashSet<Integer> has=new HashSet<>();
         has.add(20);
         has.add(30);
         has.add(40);
        System.out.println(has);
        System.out.println(has.size());
        System.out.println( has.clone());
        System.out.println( has.contains(6));
    }
}
