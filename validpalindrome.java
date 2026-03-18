import java.util.Scanner;
public class validpalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        // It will be Remove spaces and convert to lowercase
        str=str.replaceAll(" ","").toLowerCase();
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while (left<right) {
            if (str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}//Time complexity:O(n),Space complexity:O(n).
