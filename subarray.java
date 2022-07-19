import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
       
        int count = 0;
        // i is the start index
        for (int i = 0; i < array.length; i++) {
            
            // j is the number of elements which should be printed
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                // print the array from i to j
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                    
                   
                }
                
                if(sum < 0){
                    count++;
                    
                }
                
            }
        }
        System.out.println(count);

    }
}