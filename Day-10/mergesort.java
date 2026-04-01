import java.util.Scanner;
public class mergesort{
    public static void mergeSort(int arr[],int left,int right){
        if(left<right){
            //divide the array into two halves
            int mid=(left+right)/2;
            //sort each half
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            //merge sorted halves
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        //copy data
        for(int i=0;i<n1;i++)
            L[i]=arr[left+i];
        for(int j=0;j<n2;j++)
            R[j]=arr[mid+1+j];
        int i=0,j=0,k=left;
        // merge the arrays
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
            }
        }
        //it copy the remaining elements from left&right arr
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        mergeSort(arr,0,n-1);
        for(int x:arr)
            System.out.print(x+" ");
    }
}