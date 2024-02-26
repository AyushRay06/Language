// exercise created to practice linear search

public class Linearsearch {
    public static void main(String[] args) {
        int[]numbers = {23, 45, 2,4,5,6,7,8,8,7,7};
        int target = 69;
        int ans = Linearsearch(numbers, target);
        System.out.println(ans);
        
    }

    //search in the arrray: and return index if item found
    //if item not found return -1
    static int Linearsearch(int[]arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //runing a for loop to search the element
        for(int index =0;index< arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
            // this line will execute if the above return statment have not beeen executed
            return-1;
        
    }

}
