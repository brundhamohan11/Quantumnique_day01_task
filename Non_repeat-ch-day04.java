import java.util.Scanner;
public class Non-repeat_ch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[256];
        // it counts the frequency
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        //it finds first non repeating characters
        for(int i=0;i<s.length();i++){
            if (freq[s.charAt(i)]==1){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("No non-repeating character");
    }
}
