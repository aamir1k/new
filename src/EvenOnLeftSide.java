import java.util.*;
public class EvenOnLeftSide {
    public static void main(String[]args){
        int arr[] = {3,22,5,7,8,9,6};
        int j = -1;
        for (int i = 0;i< arr.length;i++){
            if (arr[i] % 2 == 0){
                j++;
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        for (int i :arr)
            System.out.println(i);
    }
}
