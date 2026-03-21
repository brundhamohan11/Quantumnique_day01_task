import java.util.Scanner;
public class Twosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0;
        int right=n-1;
        boolean found=false;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
              //why we give +1 means we start counting positions from 1 instead of 0 when printing the answer.
                System.out.println("["+(left+1)+","+(right+1)+"]");
                found=true;
                break;
            }
            else if(sum<target){
                left++;
            }
            else {
                right--;
            }
        }
        if(!found){
            System.out.println("No pair found");
        }
    }
}//Time Complexity:O(n),Space Complexity:O(1)