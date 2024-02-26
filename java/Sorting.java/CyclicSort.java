import java.util.Arrays;

 public class CyclicSort {
//     public static void main(String[] args) {
//         int[] arr = {3,5,2,1,4};
//         sort(arr);
//         System.out.println(Arrays.toString(arr));
//         System.out.println("hello");
//     }

//     static void sort(int[]arr){
//         int i = 0;
//         while(i<arr.length){
//             int correct = arr[i]-1;
//             if(arr[i]!= arr[correct]){
//                 swap(arr,i , correct);
//             }else{
//                 i++;
//             }
            
//         }
//     }

//     static void swap(int[] arr, int first ,int second){
//         int temp = arr[first];
//         arr[first]= arr[second];
//         arr[second]= temp;     
//     }
// THE ABOVE OCDE WAS FOR CYCLE SORT FO NOMBER IN THE RANGE OF 1 TO N, BUT THE CODE BELLOW IS FOR NUMBER 0 TO N 
public static void main(String[] args){
    int[] arr = {0,1,9,4,5,6,7,8,3,2};
    sort(arr);
    System.out.println(Arrays.toString(arr));
}    



static void swap(int[]arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] =  temp;
    }

    static void sort(int[]arr){
        int i = 0;
        while(i<arr.length){
            int correct =arr[i];
            if(arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }


   
}
