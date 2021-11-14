import java.util.*;

public class WaveInMatrix {
    static int R = 4;
    static int C = 4;

    static void WavePrint(int m,int n,int arr[][]){
        int i ,j = n-1,Wave = 1;


        while (j>= 0){
            if (Wave == 1) {
                for (i = 0; i < m; i++)
                    System.out.println(arr[i][j] + "");
                Wave = 0;
                j--;
            }
                else{
                    for (i = m-1;i>=0;i--)
                        System.out.println(arr[i][j] + " ");
                    Wave = 1;
                    j--;
                }
            }
        }

        public static void main(String[] args){
        int arr[][] = {{ 1,2,3,4},
                      { 5,6,7,8 },
                      {9,10,11,12},
                       {13,14,15,16}
        };
        WavePrint(R , C, arr);
    }
}
