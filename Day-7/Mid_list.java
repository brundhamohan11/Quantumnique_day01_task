import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Mid_list{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node temp=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                temp=newNode;
            }else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}//Time Complexity:O(n),Space Complexity:O(1)