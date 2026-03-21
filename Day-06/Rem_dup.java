import java.util.Scanner;
public class Rem_dup{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            System.out.println("Empty");
            return;
        }
        int i=0; //slow pointer
        for(int j=1;j<n;j++){//fast pointer
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();//it's move to next line
        System.out.println(i+1);//it'sprint count of unique elements
    }
}//Time complexity:O(n),Space complexity:O(1)