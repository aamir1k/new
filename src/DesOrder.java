import java.util.*;
public class DesOrder {
    public static void main(String[] args){
        ArrayList<String>
                list = new ArrayList<String>();

        list.add("aamir");
        list.add("kashmir");
        list.add("barsoo");
        list.add("home");
        list.add("student");

        System.out.println("Unsorted arrayList:" + list);

        Collections.sort(list,Collections.reverseOrder());

        System.out.println("in descending order" + list);
    }
}
