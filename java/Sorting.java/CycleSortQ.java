public class CycleSortQ {
    public static void main(String[] args) {
        
    }

    static int Missingnumber(int[]arr){
        int i = 0;     
        while(i<arr.length){
            int correct= arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
        }
    }
}
