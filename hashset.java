import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        int n = sc.nextInt();
        for (int i = 0; i<=n; i++){
            String kata = sc.nextLine();
            if(set.isEmpty()){
                set.add(kata);
               
            }
            else if(set.contains(kata)){
                System.out.println(set.size()-1);
            }else{
                set.add(kata);
                System.out.println(set.size()-1);
            }
        }


    }
}
