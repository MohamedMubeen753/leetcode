import java.util.Stack;

public class stack{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int top=st.peek();
        int remove=st.pop();
        boolean Emp=st.isEmpty();
        int length=st.size();
        System.out.println(top);
        System.out.println(remove);
        System.out.println(Emp);
        System.out.println(length);
        System.out.println(st);
    }
}
