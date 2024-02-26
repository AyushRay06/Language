import java.util.Arrays;

public class functionoverloadig {
    public static void main(String[] args) {
        int ans = sum(10,20);
        System.out.println(ans);
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static int sum(int a, int b){
        return a+b;
    }
    
}
