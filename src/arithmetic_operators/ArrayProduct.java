package arithmetic_operators;

import java.util.*;
public class ArrayProduct {
    public static void main(String[] args) {
        int[] arr={1,0,-4,6};
        int product=1;
        int zero_product=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero_product=0;
                continue;
            }
            product*=arr[i];
            zero_product*=arr[i];
        }
        int[] result=new int[arr.length];
        for(int i=0;i<result.length;i++){
            if(arr[i]==0){
                result[i]=product;
                System.out.println(result[i]);
                continue;
            }
            result[i]=zero_product/arr[i];
            System.out.println(result[i]);
        }

    }
}

