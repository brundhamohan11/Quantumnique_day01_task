import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class reverselist{
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        head=reverse(head);
        display(head);
    }
}//Time complexity:O(n),Space Complexity:O(1)