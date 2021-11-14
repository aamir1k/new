import java.util.*;
public class Sort0_1and2InLinearTc {
    public static void main(String[]args){
        int a[] = {0,2,0,3,0,6,0,8,7,8,2,0,1};
        int lo = 0,mid = 0,hi= a.length-1,temp = 0;
        while(mid <= hi){
            switch(a[mid]){
                case 0:{
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:{
                    temp = a[mid];
                    a[mid]= a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
        for (int i :a)
            System.out.println(i);
    }
}
