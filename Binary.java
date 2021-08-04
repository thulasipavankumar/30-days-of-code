import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Binary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        System.out.println(getMaxDigitCount(n));
    }
    public static int getMaxDigitCount(int num){
        int arr[] = decToBinary(num);
        int count = 0,max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count = 0;
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
    
   static int[] decToBinary(int n)
{
// array to store binary number
int[] binaryNum = new int[1000];

// counter for binary array
int i = 0;
while (n > 0)
{
// storing remainder in binary array
binaryNum[i] = n % 2;
n = n / 2;
i++;
}

// printing binary array in reverse order
return binaryNum;
}
}
