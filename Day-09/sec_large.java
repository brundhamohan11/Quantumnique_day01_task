import java.util.Scanner;
public class sec_large{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                seclarge=large;
                large=arr[i];
            }
            else if(arr[i]>seclarge&& arr[i]!=large){
                seclarge=arr[i];
            }
        }
        System.out.println(seclarge);
    }
}//Time complexity:O(n),Space complexity:O(1)