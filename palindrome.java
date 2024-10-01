import java.util.*;
 public class palindrome{
            public static void main(String[] args){
                Scanner str =new Scanner(System.in);
                String s = str.nextLine();
                int m= s.length()-1;
                int c=0;
                for(int i=0; i<m/2;i++) {
                    if(s.charAt(i) == s.charAt(m - i)) {
                        c++;
                    }
                    else
                    {
                        System.out.println("Not palindrome");
                        break;
                    }

                }
                if(c==m/2){
                    System.out.println("palindrome");
                }
        }
}
