package case_study;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'larrysArray' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY A as parameter.
     */

    public static void larrysArray(List<Integer> A) {
    // Write your code here
     int n=0;
     int len=A.size();
     for(int i=0;i<n-1;i++){
        for(int j=i+1;j<i+4;j++){
            if(A.get(i)>A.get(j)){
                n++;
            }
        }
        
     }
     boolean flag=false;
     if(n%2==0) {
    	 flag=true;
     }
     System.out.println(flag);
    
    

    }

}

