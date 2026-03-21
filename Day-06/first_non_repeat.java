import java.util.HashMap;
import java.util.Scanner;
public class first_non_repeat{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("No non-repeating element");
        }
    }
}//Time complexity;O(n),Space complexity:O(n)