package ExtraTopics;

/**
 * Created by sdodia on 6/2/17.
 */
public class StrBuilderEx {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Sagar!");
        System.out.println("After Append SB: "+sb);

        sb.insert(5, "Java");
        System.out.println("After Insert SB: "+sb);

        sb.replace(5,9, "Java8");
        System.out.println("After Replace SB: "+sb);

        sb.delete(9,10);
        System.out.println("After Delete SB: "+sb);

        sb.reverse();
        System.out.println("After Reverse SB: "+sb);

        System.out.println("Capacity SB: "+sb.capacity());
    }
}
