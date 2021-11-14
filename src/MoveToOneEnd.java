import java.util.*;
public class MoveToOneEnd {
    public static void main(String[]args){
        int arr[] = {3,22,5,7,8,9,6};
        int p1 = 0;
        int p2 = arr.length-1;
        while (p1<=p2){
            if (arr[p1] == 1){
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p2--;
            }else {
                p1++;
            }
        }
      for (int i:arr)
          System.out.println(i);

    }
}
