import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Data_Types {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int j;
        double e;
        String s1="";
        j = scan.nextInt()+i;
        e = scan.nextDouble()+d;
        while(scan.hasNext())
        s1 = s1+scan.next()+" ";
       
        /* Declare second integer, double, and String variables. */
        System.out.println(j);
        System.out.println(e);
        s1=s+s1;
        System.out.println(s1);
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}