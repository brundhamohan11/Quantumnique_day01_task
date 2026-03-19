import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class longest_substring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character>set=new HashSet<>();
        int left=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int curlen=right-left+1;
            if (curlen>maxlen){
                maxlen=curlen;
            }
        }
        System.out.println(maxlen);
    }
}
//Time complexity:O(n),Space Complexity:O(n)
