import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;

        }
         
        String al = a.toLowerCase();
        String bl = b.toLowerCase();


        char []aa =new char[a.length()]; 
        char []bb =new char[a.length()]; 
        for(int i=0; i<aa.length; i++){
            aa[i] = al.charAt(i);
            bb[i] = bl.charAt(i);
        }
        Arrays.sort(aa);
        Arrays.sort(bb);
        String ah = "";
        String bh = "";
        for(int i=0; i<aa.length; i++){
            ah += aa[i];
            bh += bb[i];
        }
       
        if(ah.equals(bh)){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}