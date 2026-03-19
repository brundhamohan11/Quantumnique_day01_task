import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class duplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer>seen=new HashSet<>();
        Set<Integer>duplicates=new HashSet<>();
        // Find duplicates
        for(int i=0;i<arr.length;i++){
            if(!seen.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }
        System.out.println(duplicates);
    }
}//Time complexity-->O(n),Space complextiy-->O(n)
