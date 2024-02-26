// this exersice is used to undestand variable use in recursion and this is a binary search question using recursion


public class recursionBS{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,16,45,90,95};
        int target = 8;
        System.out.println(search(arr, target, 0, arr.length- 1));
    }
// initilisation new search function and poting int s, int e in the arrgument because it will be forwarded when the nest functioon is called 
 
    static int search(int[]arr, int target, int s, int e){

// writing this statment if a nummver searched is out of array 

        if (s>e){
            return -1;
        }

//creating the int m variable and assining it it's value by the mid term formula
        int m = s+(e-s)/2; 
        if (arr[m]== target){
            return m;
        }

        if(target< arr[m]){
            return search(arr, target, s, m-1);
        }

        return search(arr, target, m+1,e);

    }
}