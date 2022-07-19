
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class arraylistfindindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int n = sc.nextInt();
        
        for (int i = 0; i <n; i++){
            list.add(new ArrayList<Integer>());
            int a = sc.nextInt();
            for (int j = 0; j<a; j++){
               list.get(i).add(j,sc.nextInt());
            }
        }
        System.out.println(list);
        int test = sc.nextInt();
        int [][]arrtest = new int[test][2];
        for(int i = 0; i <test; i++){
            for(int j = 0;j<2;j++){
                arrtest[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i <test; i++){
            for(int j = 0;j<2;j++){
                System.out.println(arrtest[i][j]);;
            }
        }
        for(int i = 0; i <test; i++){
             try{
                System.out.println(list.get(arrtest[i][0]-1).get(arrtest[i][1]-1));

             }catch(Exception e){
                System.out.println("ERROR!");
             }
             

           

           
            // try{
            //     

            // }catch (Exception e){
            //     System.out.println("error");
            // }
            
        }

    }
    
        

    
}
