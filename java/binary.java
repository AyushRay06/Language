public class binary {
    public static void main(String[] args) {
        int n ;
        n = 66;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n){
        return (n & 1)== 1;
    }
}
