import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Arrays.toString()--> prints the array values.
        //If we don’t use it, it prints the memory address
        //for(int i=0;i<n;i++){-->we can print this like also
            //System.out.print(arr[i]+" ");
         System.out.println(Arrays.toString(arr));
    }
}//Time complexity:O(n^2),Space complexity:O(1)


