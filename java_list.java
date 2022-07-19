
import java.util.*;


public class java_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());

        }
        int k = sc.nextInt();
        for (int i = 0; i < k;i++){
            String operator = sc.next();
            if(operator.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);

            }else{
                int x = sc.nextInt();
                list.remove(x);
            }

        }
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");

        }
        

    }
}
