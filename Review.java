import java.io.*;
import java.util.*;

public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int test_cases = s.nextInt();
        for(int i=0;i<test_cases;i++){
            String name = s.next();
            System.out.println(get_odd(name)+" "+get_even(name));
       
        }
    }
    public static String  get_odd(String str){
        char chr_arr[] = str.toCharArray();
        String result = "";
        for(int i=0;i<chr_arr.length;i++){
            if(i%2==0)
             result = result+chr_arr[i];
        }
        return result;
    }
    public static String  get_even(String str){
          char chr_arr[] = str.toCharArray();
        String result = "";
        for(int i=0;i<chr_arr.length;i++){
            if(i%2!=0)
             result = result+chr_arr[i];
        }
        return result;
    }
}
