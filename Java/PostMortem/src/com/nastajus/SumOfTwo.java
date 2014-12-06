package com.nastajus;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IAN on 05/12/14.
 */
public abstract class SumOfTwo {

    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    //3, 5, 7, 9
    //10
    static boolean run(int[] arr, int target){
        for( int i = 0; i < arr.length; i++){

            int diff = target - arr[i];     //10-7 = 3

            if ( map.containsKey(diff)){
                System.out.println( "found at: " + arr[map.get(diff)] + ", " + arr[i] );
                return true;
            }
            else {
                map.put(arr[i], i);       //map={<3,0>, <5,1> }
            }
        }
        System.out.println("none found");
        return false;
    }
}
