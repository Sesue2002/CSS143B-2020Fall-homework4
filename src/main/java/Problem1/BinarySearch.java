package Problem1;

import java.util.Arrays;

//Starting on problem 1 first
public class BinarySearch {

    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    //helper function
    //private static int binarySearch(int[] data, int target)
    //og
    public static int binarySearch(int[] data, int target) {
        // homework

        //variable section
        int mid;
        int l = data.length;;
        mid = l / 2;

        if(data.length == 0){
            return -1;
        }

        if(data[mid] == target){
            return mid;
        }

        //size fitting

        //if the middle is bigger we return the lower half of array
        if(data[mid] > target){
            return binarySearch(data, target, 0, mid - 1);
        }
        //filters to bigger helper
        if(data[mid] < target){
            return binarySearch(data, target, mid, data.length);
        }
        return -1;//if not present
    }

    //helper
    //for bigger boy
    private static int binarySearch(int[] data, int target, int start, int end){
        //checking if we can already return the value
        int mid = (start + end) / 2;

        if(data.length == 0){
            return -1;
        }

        if(data[mid] == target){
            return mid;
        }
        //size fitting

        //if middle is smaller
        if(data[mid] < target){
            return binarySearch(data, target, 0, mid - 1);
        }
        /*if the middle is bigger we return the lower of the upper half of array
        if(data[mid] > target){
        return binarySearch(data, target, mid + 1, end);
        }
         */
        return -1;  //if not present in the array
    }
}
