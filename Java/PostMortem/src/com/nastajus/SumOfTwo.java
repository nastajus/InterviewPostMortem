package com.nastajus;

/**
 * Created by IAN on 05/12/14.
 */
public abstract class SumOfTwo {

    static boolean run(int[] arr, int target){
        for( int i = 0; i < arr.length; i++){
            for ( int j = i; j < arr.length; j++){
                if ( arr[i] + arr[j] == target ){
                    System.out.println("i: " + arr[i] + " j:" + arr[j] );
                    return true;
                }
            }
        }
        System.out.println("none found");
        return false;
    }
}
