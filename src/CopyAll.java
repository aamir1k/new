import java.util.*;

public class CopyAll {
    public static void main(String[] args){
        List<String> original = Arrays.asList(
                "aamir",
                "kashmir",
                "home",
                "student"
        );
        List<String> cloned_list = new ArrayList<String>(original);
        System.out.println(cloned_list);
    }
}
